package pageObjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import resources.FunctionalUtilities;

public class Entryad extends FunctionalUtilities {
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Entryad.class.getName());
	
	
	
	public Entryad(WebDriver driver) {
		this.driver = driver;
		log.info("Driver is initialized");
		PageFactory.initElements(driver, this);
	}

	public void clickonEntryad() {
		driver.findElement(By.linkText("Entry Ad")).click();
	}


	

}
