package StepDefination;

import io.cucumber.java.en.*;

public class Login {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("1");
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("2");
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("3");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("4");
	    throw new io.cucumber.java.PendingException();
	}
}
