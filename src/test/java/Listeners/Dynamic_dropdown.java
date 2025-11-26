package Listeners;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class Dynamic_dropdown {

    public static WebDriver driver;

    @Test
    public void WindowHandles() {

        driver = new ChromeDriver();

        String str1 = "kiribati";

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("kiri");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li")));

              List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

        for (WebElement L : list) {

            String str = L.getText();
            System.out.println(str);

            if (str.equalsIgnoreCase(str1)) {
                L.click();
                break;
            }
        }
    }
}
