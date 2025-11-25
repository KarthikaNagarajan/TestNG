package Listeners;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Upload_And_Download {

    public static WebDriver driver;

    @Test
    public void WindowHandles() throws InterruptedException, IOException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.canva.com/pdf-editor/");

        // Wait for button to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[contains(text(),'Upload your PDF')])[1]")
        )).click();

        // Run AutoIT file
        Runtime.getRuntime().exec("C:\\Users\\Raveena\\OneDrive\\Documents\\upload\\auto1.exe");

        Thread.sleep(5000); // Give time for upload to complete
    }
}
