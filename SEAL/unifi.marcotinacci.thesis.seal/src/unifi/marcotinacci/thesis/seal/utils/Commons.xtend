package unifi.marcotinacci.thesis.seal.utils

import org.eclipse.emf.common.CommonPlugin
import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import java.util.List
import java.io.InputStreamReader
import java.io.BufferedReader

class Commons {
	
	def static String getSrcGenURI(Resource resource) {
		// source folder
		val srcFolder = new File(CommonPlugin::resolve(resource.URI).path)
		return srcFolder.parentFile + "/../src-gen/"
	}
	
	def static String execute(List<String> args){
		var process = Runtime::runtime.exec(args)
		var String result = ""

		// DEBUG
		println("DEBUG - EXEC : "+args)
		 
		var stdin = process.getInputStream
		var isr = new InputStreamReader(stdin)
		var br = new BufferedReader(isr)
		var String line = null
		while ( (line = br.readLine()) != null)
		    result = result + line + '\n'
		return result
	}
}