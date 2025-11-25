package PageObejects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Textcontextsetup;

public class Landingpage {
	public WebDriver driver;
	
	//public String gettext;
	
	public Landingpage(WebDriver driver) {
		this.driver= driver;
		
	}
	By search=By.xpath("//input[@type='search']");
	By product_name=By.cssSelector("h4.product-name");
	By inc=By.cssSelector("a.increment");
	By addtocart=By.cssSelector(".product-action button");
	
   By cart=By.cssSelector("img[alt='Cart']");
  By checkout= By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	public void searchbox(String shortname) throws InterruptedException {
	driver.findElement(search).sendKeys(shortname);
	Thread.sleep(2000);
	}
	public String gettext() {
		String gettext=driver.findElement(product_name).getText().split("-")[0].trim();
		
		System.out.println(gettext+ " is the product name");
		return gettext;
		
	}
	public void click_on_dealss() {
		driver.findElement(By.linkText("Top Deals")).click();
	
	}
	
	public void increment(int quantity) {
		int i=quantity -1;
		while(i>0) {
			driver.findElement(inc).click();
			i--;
		}
		
				
		
	}
	public void add_to_cart() {
		driver.findElement(addtocart).click();
	
	}
	
	public void clickoncart() {
		driver.findElement(cart).click();
	}
	public void checkout() {
		driver.findElement(checkout);
	}

}
