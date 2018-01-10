package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;

public class APIScenariosDefs {
	
		
	@Given("^the end point is \"([^\"]*)\"$")
	public void the_end_point_is(String arg1) throws Throwable {
	 
	}

	@Then("^the email address in the response should be \"([^\"]*)\"$")
	public void the_email_address_in_the_response_should_be(String arg1) throws Throwable {
	    
	}

	@Then("^the response should contain (\\d+) users$")
	public void the_response_should_contain_users(int arg1) throws Throwable {
	
	}



}
