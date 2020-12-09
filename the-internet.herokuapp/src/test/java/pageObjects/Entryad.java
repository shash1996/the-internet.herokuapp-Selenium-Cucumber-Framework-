package pageObjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import resources.FunctionalUtilities;

public class Entryad extends FunctionalUtilities {
	
	WebDriver driver;
	public void hitUrl() throws IOException {
		driver=getDriver();
		hitUrl(driver);
	}
	
	

	

}
