package stepDefinitions;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.Launchbrowser;
import resources.ExtentReporter;
import resources.FunctionalUtilities;


public class Hooks extends FunctionalUtilities {
	
	public static Scenario scenario;
	public static ExtentTest test;
	//FunctionalUtilities fu=new FunctionalUtilities();
	
	private WebDriver driver;
	private FunctionalUtilities f;
	
	@Before(order = 0)
	public void setUp() {
		f=new FunctionalUtilities();
		driver=f.getDriver();
	}
	@After(order = 0)
	public void quitbrowser() {
		driver.quit();
	}
	
	@After(order = 1)
	public void Scenariofailed(Scenario scenario) {
		if(scenario.isFailed()) {
		String sceenshotName=scenario.getName().replaceAll(" ", "_");
		byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	
		
		scenario.attach(sourcePath, "image/png", sceenshotName);
		}
	}
}

	
		
		//Launchbrowser.fu.givedriver().close();

