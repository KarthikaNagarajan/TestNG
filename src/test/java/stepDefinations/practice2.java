package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObejects.PageObjectmanager;
import PageObejects.offerspage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Generic_utils;
import utils.Textcontextsetup;



public class practice2 {
	public WebDriver driver;
	
	public String product;
	
	Textcontextsetup textcontextsetup;
	PageObjectmanager pageObjectmanager;
	 Generic_utils generic_utils;
	
	public practice2(Textcontextsetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		
		
	
	}
	
	

	
	
	@When("^check the extract product name by search (.+) shortname in Top deals$")
	public void check_the_extract_product_name_by_search_tom_shortname_in_top_deals(String shortname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		click_top_deals();
		offerspage Offerspage=textcontextsetup.pageObjectmanager.getofferspage();
		Offerspage.searchbox(shortname);
		
		//offerspage o=new offerspage(textcontextsetup.driver);
		//o.searchbox(shortname);
		
		
		
		
	
	 product=Offerspage.gettext();
	 Assert.assertEquals(textcontextsetup.product_name, product);
	
	}
	public void click_top_deals() throws InterruptedException {
		
		Thread.sleep(3000);
		textcontextsetup.generic_utils.windowhandles();
		
		
	}
	@When("Quit the driver")
	public void quit_the_driver() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		System.out.println("working expected*************************************");
		
	}


}
