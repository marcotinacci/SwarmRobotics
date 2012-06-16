package unifi.marcotinacci.thesis.seal.generator

import java.util.HashMap
import unifi.marcotinacci.thesis.seal.seal.And
import unifi.marcotinacci.thesis.seal.seal.Assign
import unifi.marcotinacci.thesis.seal.seal.Div
import unifi.marcotinacci.thesis.seal.seal.Eq
import unifi.marcotinacci.thesis.seal.seal.ExternalReference
import unifi.marcotinacci.thesis.seal.seal.Geq
import unifi.marcotinacci.thesis.seal.seal.Gtr
import unifi.marcotinacci.thesis.seal.seal.Leq
import unifi.marcotinacci.thesis.seal.seal.Less
import unifi.marcotinacci.thesis.seal.seal.Literal
import unifi.marcotinacci.thesis.seal.seal.LocalReference
import unifi.marcotinacci.thesis.seal.seal.Minus
import unifi.marcotinacci.thesis.seal.seal.Multi
import unifi.marcotinacci.thesis.seal.seal.Neq
import unifi.marcotinacci.thesis.seal.seal.NoAction
import unifi.marcotinacci.thesis.seal.seal.Not
import unifi.marcotinacci.thesis.seal.seal.Or
import unifi.marcotinacci.thesis.seal.seal.Plus
import unifi.marcotinacci.thesis.seal.seal.Quantifier

import static unifi.marcotinacci.thesis.seal.generator.ExpressionEvaluator.*

class ExpressionEvaluator {
	
	static val HashMap vars = newHashMap()
	
	def static dispatch eval (NoAction n){
		// nothing to do
	} 

	def static dispatch eval(Assign a){
		vars.put(a.variable.name, eval(a.expr))
	}
	
	def static dispatch eval(And e){
		eval(e.left) as Boolean && eval(e.right) as Boolean
	}
	
	def static dispatch eval(Or e){
		eval(e.left) as Boolean || eval(e.right) as Boolean
	}
	
	def static dispatch eval(Not e){
		!eval(e.cond) as Boolean
	}

	def static dispatch eval(Leq e){
		eval(e.left) as Integer <= eval(e.right) as Integer
	}	

	def static dispatch eval(Less e){
		(eval(e.left) as Integer) < (eval(e.right) as Integer)
	}
	
	def static dispatch eval(Geq e){
		(eval(e.left) as Integer) >= (eval(e.right) as Integer)
	}	

	def static dispatch eval(Gtr e){
		eval(e.left) as Integer > eval(e.right) as Integer
	}
	
	def static dispatch eval(Eq e){
		eval(e.left) as Integer == eval(e.right) as Integer
	}
	
	def static dispatch eval(Neq e){
		eval(e.left) as Integer != eval(e.right) as Integer
	}

	def static dispatch eval(Plus e){
		eval(e.left) as Integer + eval(e.right) as Integer
	}
	
	def static dispatch eval(Minus e){
		eval(e.left) as Integer - eval(e.right) as Integer
	}
	
	def static dispatch eval(Multi e){
		eval(e.left) as Integer * eval(e.right) as Integer
	}
	
	def static dispatch eval(Div e){
		eval(e.left) as Integer / eval(e.right) as Integer
	}

	def static dispatch eval(Literal e){
		try{
			Boolean::parseBoolean(e.value)
		}catch(NumberFormatException e1){
			try{
				Integer::parseInt(e.value)
			}catch(NumberFormatException e2){
				Double::parseDouble(e.value)
			}
		}
	}

	def static dispatch eval(LocalReference e){
		
	}	

	def static dispatch eval(ExternalReference e){

	}
	
	def static dispatch eval(Quantifier e){

	}
	
}