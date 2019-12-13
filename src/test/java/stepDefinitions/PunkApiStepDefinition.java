package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PunkApiStepDefinition {

	
	@When("I send request to punk api")
	public void i_send_request_to_punk_api_V(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(int1);
	}

	@When("I retrieve beers")
	public void i_retrieve_beers() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("retrive beers");
	}

	@Then("I should get {int} responce")
	public void i_should_get_responce(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("retrive beer1s");
	}

	@Then("I should have list of beers")
	public void i_should_have_list_of_beers() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("retrive beers2");
	}

	@When("I retrieve single beer")
	public void i_retrieve_single_beer() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I should get {int} beer")
	public void i_should_get_beer(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("I have step def")
	public void i_have_step_def() {
		
	}
}
