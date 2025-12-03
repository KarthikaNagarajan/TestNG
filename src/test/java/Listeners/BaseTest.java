package Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public static WebDriver driver;
    public String Screenshotsubfoldername;

    @BeforeTest
    @Parameters("browser")
    public void launchBrowser(String browser) {

        System.out.println("Browser selected: " + browser);

        // ✔ If Jenkins passes -Dbrowser parameter, override XML value
        if (System.getProperty("browser") != null) {
            browser = System.getProperty("browser");
        }

        // ✔ Setup drivers automatically
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } 
        else {
            throw new IllegalArgumentException("Invalid browser name: " + browser);
        }
    }

    @Test
    public void openGoogle() {
        driver.get("https://google.com");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterTest
    public void quit_driver() {
        driver.quit();
    }

    @AfterMethod
    public void screenshotCapture(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            takesscreenshot(result.getTestContext().getName() + "__" + result.getMethod().getMethodName());
        }
    }

    public void takesscreenshot(String filename) {

        if (Screenshotsubfoldername == null) {
            LocalDateTime localdate = LocalDateTime.now();
            DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
            Screenshotsubfoldername = localdate.format(dateformat);
        }

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);

        String safeFilename = filename.replaceAll("[^a-zA-Z0-9\\.\\-]", "_");

        File destination = new File("./Screenshot/" + Screenshotsubfoldername + "/" + safeFilename + ".png");

        try {
            destination.getParentFile().mkdirs();  // ✔ Create folder
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Screenshot saved successfully: " + destination.getAbsolutePath());
    }

}
