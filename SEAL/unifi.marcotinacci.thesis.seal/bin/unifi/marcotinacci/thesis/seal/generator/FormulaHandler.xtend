package unifi.marcotinacci.thesis.seal.generator

import java.util.HashMap
import java.util.List
import java.util.Set
import java.util.regex.Pattern
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.internal.xtend.util.Pair
import unifi.marcotinacci.thesis.seal.seal.ModuleDefine
import unifi.marcotinacci.thesis.seal.seal.Program
import unifi.marcotinacci.thesis.seal.utils.Commons

class FormulaHandler {
	private Resource resource
	private HashMap<List<Integer>, HashMap<List<Integer>,Double>> index
	private Integer subjectParamsNumber
	private Integer totalParamsNumber
	
	new(Resource resource) {
		this.resource = resource
		var Program p = (resource.contents.get(0) as Program)
		subjectParamsNumber = p.modules.get(0).variables.size
		if(p.isEmptyEnv)
			totalParamsNumber = subjectParamsNumber
		else
			totalParamsNumber = p.environment.modules.countParams + subjectParamsNumber
		index = newHashMap
	}
	
	def getIndex(){
		return index;
	}

	/**
	 * execute the check for the specified formula on the resource, 
	 * storing all the results on the index table 
	 */
	def execModelCheck(String formula) { 
		var String prismResult = ""
		var localURI = Commons::getSrcGenURI(resource)
		
		// TODO minimize/maximize
		// TODO prism in path environment
		
		// model checking
		var List<String> args = newArrayList(
			"/Applications/prism-4.0.3-osx64/bin/prism", 
			localURI + "model.pm", 
			"-pctl", 
			"filter(print, Pmax=? [G <= 10 !" + formula + "])"
		)
		
		prismResult = Commons::execute(args)
		
		// lettura risultati tramite regex
		var Pattern patternAllZero = Pattern::compile("\\(all zero\\)")
		if(patternAllZero.matcher(prismResult).find){
			// all zero case
			// DEBUG
			println("DEBUG : caso tutte le prob a zero!")
		}else{
			// compose result row pattern
			var patternParams = "(\\d+)"
			var i = 1
			while (i < totalParamsNumber){
				patternParams = patternParams + ",(\\d+)" 
				i=i+1
			}
			var Pattern patternResults = Pattern::compile("\\d+:\\(" + patternParams + "\\)=(\\d.\\d+)")
			
			var m = patternResults.matcher(prismResult)
			while (m.find()) {
				var j = 1
				var List<Integer> subjectParams = newArrayList
				var List<Integer> otherParams = newArrayList
				while( j <= totalParamsNumber ){
					if(j <= subjectParamsNumber){
						subjectParams.add(Integer::parseInt(m.group(j)))
					}else{
						otherParams.add(Integer::parseInt(m.group(j)))
					}
					j=j+1
				}
				
				var subindex = index.get(subjectParams)
				if(subindex == null){
					subindex = newHashMap
					index.put(subjectParams, subindex)
				}
				subindex.put(otherParams, Double::parseDouble(m.group(j)))
			}
		}
		
		// DEBUG
		println("DEBUG - INDEX : " + index)
	}
	
	/**
	 * precondition: size of 'args' must be equal to totalParamsNumber
	 * params: list of integer, the complete state of the sistem
	 * returns: probability of the case
	 */
	def Double getSingleCaseProbability(List<Integer> args){
		var subindex = index.get(args.subList(0,subjectParamsNumber))
		if(subindex == null){
			return 0.0
		}else{
			var prob = subindex.get(args.subList(subjectParamsNumber+1, totalParamsNumber))
			if(prob == null){
				return 0.0
			}else{
				return prob
			}
		}
	}
	
	/**
	 * precondition: size of 'args' must be equal to subjectParamsNumber
	 * params: list of integer params of the subject
	 * returns: list of integer key of the max probability and the corresponding probability. 
	 * 		If key is null (and prob is -1) there are no entries in the hash table
	 */
	def Pair<List<Integer>,Double> getMinProbability(List<Integer> args){
		var subindex = index.get(args)
		var List<Integer> minKey = null
		var Double minProb = 2.0
		var Set<List<Integer>> keys = subindex.keySet
		for(k : keys){
			val p = subindex.get(k)
			if(p < minProb){
				minProb = p
				minKey = k
			}
		}
		return new Pair<List<Integer>,Double>(minKey,minProb)
	}

	def Integer countParams(List<ModuleDefine> modules) { 
		var counter = 0
		for(m:modules){
			counter = counter + m.variables.size
		}
		counter
	}
}