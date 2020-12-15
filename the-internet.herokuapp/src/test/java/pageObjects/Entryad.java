package pageObjects;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import resources.FunctionalUtilities;
import stepDefinitions.Hooks;

public class Entryad extends FunctionalUtilities {
	
	
	@FindBy(xpath = "//div[@class='modal']/div[3]/p")
	WebElement close;
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Entryad.class.getName());
	
	
	
	public Entryad(WebDriver driver) {
		this.driver = driver;
		log.info("Driver is initialized");
		
		PageFactory.initElements(driver, this);
	}

	public void clickonEntryad() {
		driver.findElement(By.linkText("Entry Ad")).click();
		log.info("Clicked on Entry Ad link present");
	}

	public void close() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("arguments[0].click()", close);
		
			log.info("Closed the ad Pop up");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.info("Can not click on the link");
			e.printStackTrace();
			Hooks.test.log(Status.INFO, e.getMessage());
			Assert.fail();
		   
		   
		}
	}
	public void getTitle() {
		

		log.info("Getting the Title");
	}


	

}
