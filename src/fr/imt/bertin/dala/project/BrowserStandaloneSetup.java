/*
 * generated by Xtext 2.36.0
 */
package fr.imt.bertin.dala.project;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BrowserStandaloneSetup extends BrowserStandaloneSetupGenerated {

	public static void doSetup() {
		new BrowserStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
