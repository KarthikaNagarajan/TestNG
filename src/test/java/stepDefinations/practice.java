package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObejects.Landingpage;
import PageObejects.PageObjectmanager;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Textcontextsetup;



public class practice {
	public WebDriver driver;
	public String product_name;
	PageObjectmanager pageObjectmanager;
	public Landingpage landingpage;
	
	
	Textcontextsetup textcontextsetup;
	public practice(Textcontextsetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this. landingpage=textcontextsetup.pageObjectmanager.getlandingpage();
		
	
	}

	@Given("user should be on practice landing page")
	public void user_should_be_on_practice_landing_page() {
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	@Given("^search the product with short name (.+) and extract the product name$")
	public void search_the_product_with_short_name_and_extract_the_product_name(String string) throws InterruptedException {
		
		 //pageObjectmanager=new PageObjectmanager(textcontextsetup.driver);
		 
		
		
		landingpage.searchbox( string);
		
	    // Write code here that turns the phrase above into concrete actions
		
		textcontextsetup.product_name=landingpage.gettext();
		System.out.println(textcontextsetup.product_name+"is the product name");
		Thread.sleep(2000);
		landingpage.click_on_dealss();
	
	}
	@Given("Add {string} increments to the that product")
	public void add_increments_to_the_that_product(String string) throws InterruptedException {
	    landingpage.increment(Integer.parseInt(string));
	    Thread.sleep(5000);
	    landingpage.add_to_cart();
	    Thread.sleep(5000);
	    landingpage.clickoncart();
	    
	    
	}
	@Given("Navigate to the proceed checkout")
	public void navigate_to_the_proceed_checkout() throws InterruptedException {
		   Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
		landingpage.checkout();
	    
	}

	
	

}
