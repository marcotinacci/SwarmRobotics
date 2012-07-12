package unifi.marcotinacci.thesis.seal.generator

import org.eclipse.emf.ecore.resource.Resource
import unifi.marcotinacci.thesis.seal.seal.Program
import unifi.marcotinacci.thesis.seal.seal.ModuleDefine
import unifi.marcotinacci.thesis.seal.seal.Rule

class CPPCompiler{
	
	private Resource resource
	
	new(Resource resource) {
		this.resource = resource
	}

	def compile(){
		// TODO insert static cpp argos code
		(resource.contents.get(0) as Program).compile
	}
	
	def private dispatch compile(Program program) { 
		program.modules.get(0).compile
	}
	
	def private dispatch compile(ModuleDefine moduleDefine) {
		var tpl = '''''' 
		for(Rule rule: moduleDefine.rules){
			tpl = '''«tpl»«rule.compile»'''
		}
		tpl
	}

	def private dispatch compile(Rule rule){
		// TODO
		''''''
	}
	
}