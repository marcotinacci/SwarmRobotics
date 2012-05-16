
package unifi.marcotinacci.thesis.seal;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SealStandaloneSetup extends SealStandaloneSetupGenerated{

	public static void doSetup() {
		new SealStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

