package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import stepDefinitions.Hooks;

public class JavascriptAlert {
	
	@FindBy(linkText = "JavaScript Alerts")
	WebElement link;
	
	@FindBy(xpath = "//ul[@style='list-style-type: none;']/li[1]/button")
	WebElement alert;
	
	public WebDriver driver;
	public Logger log=LogManager.getLogger(JavascriptAlert.class.getName());

	public JavascriptAlert(WebDriver driver) {
		this.driver = driver;
		//System.out.println(driver+" Javascript");
		log.info("Driver is initialised");
	
		PageFactory.initElements(driver,this);
	}

	public void clicklink() {
		// TODO Auto-generated method stub
		try {
			link.click();
			log.info("Clicked on javascript alert Page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("Couldnt click on javascript alert link");
			e.printStackTrace();
			Hooks.test.log(Status.INFO, e.getMessage());
			Assert.fail();
		}
		
		
	}

	public void clickAlert() {
		// TODO Auto-generated method stub
		try {
			alert.click();
			driver.switchTo().alert().accept();
			log.info("Accepted the alert");
		}catch(Exception e) {
			e.printStackTrace();
			log.error("Something wrong happened in either clicking on alert or accepting the alert");
			Hooks.test.log(Status.INFO, e.getMessage());
			Assert.fail();
		}
		
	}
	
	
}
