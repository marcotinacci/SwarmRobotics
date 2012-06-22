package unifi.marcotinacci.thesis.seal.validation;

import org.eclipse.xtext.validation.Check;

import unifi.marcotinacci.thesis.seal.seal.Program;
 

public class SealJavaValidator extends AbstractSealJavaValidator {
	
	@Check
	public void checkNumberAction(Program program) {
		if (program.getActions().size() == 0) {
			warning("Devi beccare", null);
		}
	}

}
