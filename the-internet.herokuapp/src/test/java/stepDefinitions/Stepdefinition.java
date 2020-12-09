package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Entryad;

public class Stepdefinition {
	Entryad ad=new Entryad();
	@Given("We have to go the the url of UAT")
	public void we_have_to_go_the_the_url_of_UAT() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			ad.hitUrl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	@When("User will click on entry ad link")
	public void user_will_click_on_entry_ad_link() {
	    // Write code here that turns the phrase above into concrete actions
	    
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
