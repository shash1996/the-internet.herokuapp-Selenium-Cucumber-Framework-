package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Entryad;
import pageObjects.Launchbrowser;
import resources.FunctionalUtilities;

public class Stepdefinition   {
	
	FunctionalUtilities fu=new FunctionalUtilities();
	public WebDriver driver=fu.getDriver();
	Entryad ad=new Entryad(driver);
	@Given("We have to go the the url of UAT")
	public void we_have_to_go_the_the_url_of_UAT() {
		Launchbrowser.navigatetourl();
		
	}

	@When("User will click on entry ad link")
	public void user_will_click_on_entry_ad_link() {
	    // Write code here that turns the phrase above into concrete actions
	    ad.clickonEntryad();
	}

	@Then("We will close the ad popped in the screen")
	public void we_will_close_the_ad_popped_in_the_screen() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("We will get the title of URL")
	public void we_will_get_the_title_of_URL() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
