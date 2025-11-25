package PageObejects;

import org.openqa.selenium.WebDriver;

import stepDefinations.hooks;

public class PageObjectmanager {
	public Landingpage landingpage;
	public offerspage Offerspage;
	public WebDriver driver;
	public hooks hook;
	public PageObjectmanager(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public  Landingpage getlandingpage() {
		landingpage=new Landingpage(driver);
		return landingpage;
		
		
	}
	public offerspage  getofferspage () {
		Offerspage =new offerspage (driver);
		return Offerspage;
	
		
		
	}
	
	

}
