package stepDefinitions;

import org.junit.AfterClass;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import resources.ExtentReporter;
import resources.FunctionalUtilities;


public class Hooks extends FunctionalUtilities {
	
	public static Scenario scenario;
	 ExtentTest test;
	static ExtentReports extent=ExtentReporter.getReportObject();
	@Before
	public void beforeScenario(Scenario scenario) {
		Hooks.scenario=scenario;
		test= extent.createTest(scenario.getName());
		
	}
	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			String path=getScreenshot(scenario.getName(), driver);
			test.fail(scenario.getName()+" is failed");
			test.addScreenCaptureFromPath(path, scenario.getName());
			
		}
		else {
			test.log(Status.PASS, "PASSED");
		}
		extent.flush();
		driver.close();
	
	}

}
