package unifi.marcotinacci.thesis.seal.generator

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.CommonPlugin
import org.eclipse.emf.ecore.resource.Resource

class FormulaHandler {
	private String formula
	private String results
	private List<Double> probabilities
	private HashMap index
	
	new(String formula, Resource resource) {
		this.formula = formula
		results = execModelCheck(resource, formula)
		probabilities = newArrayList()
		index = newHashMap()
		// TODO costruire indice e vettore prob
	}
	
	def execModelCheck(Resource resource, String formula) { 
		var String ret = ""
		var localURI = getSrcGenURI(resource)
		
		// TODO pctl formula generation
		// TODO prism in path environment
		// model checking
		var String[] args = newArrayList(
			"/Applications/prism-4.0.3-osx64/bin/prism", 
			localURI + "model.pm", 
			"-pctl", 
			"filter(print, Pmin=? [G <= 10 !" + formula + "])"
		)
		var process = Runtime::runtime.exec(args)
		print("DEBUG - EXEC : "+args) // DEBUG
		var stdin = process.getInputStream();
		var isr = new InputStreamReader(stdin);
		var br = new BufferedReader(isr);
		var String line = null;
		while ( (line = br.readLine()) != null)
		    ret = ret + line + '\n'
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