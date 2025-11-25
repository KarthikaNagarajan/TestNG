package Listeners;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;
public class windowHandles {
	public static WebDriver driver;
	@Test
	public void WindowHandles() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement mini=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> links=mini.findElements(By.tagName("a"));
		System.out.println("total links---->"+links.size());
		for(WebElement link:links) {
			String Openwindow=Keys.chord(Keys.CONTROL,Keys.ENTER);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			link.sendKeys(Openwindow);
			
		}
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator<String>it=windowhandles.iterator();
		while(it.hasNext()) {
			String window=it.next();
			System.out.println(driver.getCurrentUrl());
			
			
		}
		
		
		
		
	}

}
