package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import resources.FunctionalUtilities;

public class Launchbrowser extends FunctionalUtilities {
	public static Logger log=LogManager.getLogger(Launchbrowser.class.getName());
	public static void navigatetourl() {
		hitUrl();
		log.info("Browser is initialised");
	
	}

}
