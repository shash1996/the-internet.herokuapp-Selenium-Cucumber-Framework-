package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import resources.FunctionalUtilities;
import stepDefinitions.Hooks;

public class Launchbrowser extends FunctionalUtilities {
	public static Logger log=LogManager.getLogger(Launchbrowser.class.getName());
	//public WebDriver driver;
	//public static FunctionalUtilities fu;
	public static void   navigatetourl() {
		hitUrl();
		log.info("Browser is initialised");
		/*
		 * try { fu= new FunctionalUtilities(); driver=fu.getDriver(); fu.hitUrl();
		 * log.info("Browser is initialised");
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); Hooks.test.log(Status.INFO, e.getMessage());
		 * Assert.fail(); } return driver;
		 */
	
	}

}
