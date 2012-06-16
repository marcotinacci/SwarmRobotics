/*
 * generated by Xtext
 */
package unifi.marcotinacci.thesis.seal.scoping;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import unifi.marcotinacci.thesis.seal.seal.ExternalReference;
import unifi.marcotinacci.thesis.seal.seal.Range;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class SealScopeProvider extends AbstractDeclarativeScopeProvider {
	
	IScope scope_Range_variable(Range r, EReference ref){
		return Scopes.scopeFor(r.getModule().getVariables());
	}

	IScope scope_ExternalReference_variable(ExternalReference r, EReference ref){
		return Scopes.scopeFor(r.getModule().getModule().getVariables());
	}
	
	// TODO scope variabili dichiarate
	
	// TODO scope variabili di quantificatore
	
}
