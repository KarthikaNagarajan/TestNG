package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources1//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser_properties=prop.getProperty("browser");
		String Maven_cmd=System.getProperty("browser");
		String browser=Maven_cmd!=null ? Maven_cmd : browser_properties;
		
		
		
			
		if(driver == null) {
			if(browser.equalsIgnoreCase("edge")) 
			{
				WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				 //driver.manage().window().maximize();
			}
			if(browser.equalsIgnoreCase("chrome")) 
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				//driver.manage().window().maximize();
				

			}
		driver.get(url);
		
		
			

	   
		
	
				
		
	    
		
		
		
	
		
		}
		return driver;
	}

}
