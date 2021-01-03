package Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue= {"stepDefinitions"},monochrome=true,
plugin = {"pretty","html:target/cucumber-html-report/cucumber-report.html", "json:target/cucumber-json-report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class Testrunner {

}
