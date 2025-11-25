package Demo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public WebDriver driver;
@Test
	public void IFrames() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.findElement(By.id("name")).sendKeys("Hello");
	driver.switchTo().frame("frm1");
	WebElement dropdown = driver.findElement(By.id("course"));
	Select select = new Select(dropdown);


	
	select.selectByVisibleText("Java");
	
	
	
		
	}
}
