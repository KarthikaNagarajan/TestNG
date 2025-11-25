package PageObejects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerspage {
public WebDriver driver;
	
	//public String gettext;
	
	
	public offerspage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By search =By.id("search-field");
	By product=By.cssSelector("tr td:nth-child(1)");
	public void searchbox(String shortname) throws InterruptedException {
		driver.findElement(search).sendKeys(shortname);
		Thread.sleep(2000);
		}
   public String gettext() {
		String gettext=driver.findElement(product).getText().split("-")[0].trim();
			
		System.out.println(gettext+ " is the product name");
		return gettext;
			
		}
   

}
