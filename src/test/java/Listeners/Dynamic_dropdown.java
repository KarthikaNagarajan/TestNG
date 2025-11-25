package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;
public class Dynamic_dropdown {
	public static WebDriver driver;
	@Test
	public void WindowHandles() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//div[@class='cen-left-align']/fieldset/input")).sendKeys("ind");
		  String text= driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]/div")).getText();
		  System.out.println(text);
				//List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div")).
		
		
		
	}

}
