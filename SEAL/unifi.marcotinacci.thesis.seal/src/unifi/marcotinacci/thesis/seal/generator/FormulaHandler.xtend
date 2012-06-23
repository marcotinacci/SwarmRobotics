package unifi.marcotinacci.thesis.seal.generator

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.HashMap
import java.util.List
import java.util.regex.Pattern
import org.eclipse.emf.common.CommonPlugin
import org.eclipse.emf.ecore.resource.Resource

class FormulaHandler {
	private Resource resource
	private String results
	private HashMap<List<Integer>, HashMap<List<Integer>,Double>> index
	private Integer subjectParamsNumber
	private Integer totalParamsNumber
	
	new(Resource resource) {
		this.resource = resource
		index = newHashMap
		totalParamsNumber = 4
		subjectParamsNumber = 2
	}

	def execModelCheck(String formula) { 
		var String ret = ""
		var localURI = getSrcGenURI(resource)
		
		// TODO pctl formula generation
		// TODO minimize/maximize
		// TODO prism in path environment
		// model checking
		var List<String> args = newArrayList(
			"/Applications/prism-4.0.3-osx64/bin/prism", 
			localURI + "model.pm", 
			"-pctl", 
			"filter(print, Pmin=? [G <= 10 !" + formula + "])"
		)
		var process = Runtime::runtime.exec(args)
		println("DEBUG - EXEC : "+args) // DEBUG
		var stdin = process.getInputStream();
		var isr = new InputStreamReader(stdin);
		var br = new BufferedReader(isr);
		var String line = null;
		while ( (line = br.readLine()) != null)
		    ret = ret + line + '\n'
		
		// DEBUG
		// println("DEBUG - PRISM RESULT: "+ ret)
		
		
		// lettura risultati tramite regex
		var Pattern patternAllZero = Pattern::compile("\\(all zero\\)")
		if(patternAllZero.matcher(ret).find){
			// all zero case
			println("DEBUG : caso tutte le prob a zero!")
			// TODO
		}else{
			// compose resutl row pattern
			var patternParams = "(\\d+)"
			var i = 1
			while (i < totalParamsNumber){
				patternParams = patternParams + ",(\\d+)" 
				i=i+1
			}
			var Pattern patternResults = Pattern::compile("\\d+:\\(" + patternParams + "\\)=(\\d.\\d+)")
			
			var m = patternResults.matcher(ret);
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
			print("DEBUG - INDEX : " + index)
		}
		    
		return ret
	}
	
	def getProbability(List<Integer> args){
		var HashMap table = index
		for(arg : args){
			table = table.get(arg) as HashMap
		}
	}
	
	// TODO fattorizzare in un pacchetto utils
	def getSrcGenURI(Resource resource) {
		// source folder
		val srcFolder = new File(CommonPlugin::resolve(resource.URI).path)
		return srcFolder.parentFile + "/../src-gen/" 
	}
	
}