package pageObjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import resources.FunctionalUtilities;

public class Entryad extends FunctionalUtilities {
	
	public WebDriver driver;
	
	
	
	public Entryad(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonEntryad() {
		driver.findElement(By.linkText("Entry Ad")).click();
	}


	

}
