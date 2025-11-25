package stepDefinations;

import java.sql.Driver;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Main_steps {
	@Given("user is on netbanking login page")
	public void user_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_is_on_netbanking_login_page");
	}
	@When("^user login into application with (.+) and (.+)$")
	public void user_login_into_application_with_credit_and_charan123_combination(String user,String user1) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(user);
	   System.out.println(user1);
	}
	   
	@When("Home page should display")
	public void home_page_should_display() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page should display");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");
	}
	@Given("practice landing page should be displayed")
	public void practice_landing_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("practice landing page should be displayed");
	}
	@When("enter the sign up details")
	public void enter_the_sign_up_details(List<String> data) {
		
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	    
	
	}
	@When("click on sigh up button")
	public void click_on_sigh_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	
	
	}
	
	@When("launch the browser from config value")
	public void launch_the_browser_from_config_value() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("**************************************************");
		System.out.println("launch the browser from config value");
	}
	@When("hit the home page of url landing page")
	public void hit_the_home_page_of_url_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("**************************************************");
		System.out.println("hit the home page of url landing page");
	}







	



	



	

}
