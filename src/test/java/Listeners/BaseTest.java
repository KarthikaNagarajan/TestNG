package Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.mongodb.diagnostics.logging.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.format.DateTimeFormatter;
public class BaseTest {
	public static WebDriver driver;
	public String Screenshotsubfoldername;
	public static Logger log;
	
	@BeforeTest
	public void Driver_launching() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void quit_driver() {
		driver.quit();
		
	}
	@AfterMethod
	public void screenshotcaptue(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			takesscreenshot(result.getTestContext().getName()+"__"+result.getMethod().getMethodName()+".png");
		}
		
	}
	public void takesscreenshot(String filename) {
	    if (Screenshotsubfoldername == null) {
	        LocalDateTime localdate = LocalDateTime.now();
	        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss"); // ✅ SAFE FORMAT
	        Screenshotsubfoldername = localdate.format(dateformat);
	    }

	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File source = screenshot.getScreenshotAs(OutputType.FILE);

	    // Optional: sanitize filename too
	    String safeFilename = filename.replaceAll("[^a-zA-Z0-9\\.\\-]", "_");

	    File destination = new File("./Screenshot/" + Screenshotsubfoldername + "/" + safeFilename + ".png");

	    try {
	        //destination.getParentFile().mkdirs(); // ✅ Make sure folder exists
	        FileUtils.copyFile(source, destination);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    System.out.println("Screenshot saved successfully: " + destination.getAbsolutePath());
	}

	
	

}
