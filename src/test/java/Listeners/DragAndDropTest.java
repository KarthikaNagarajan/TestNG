package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;   // Selenium Actions
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest  {

    public static WebDriver driver;

    @Test
    public void DragandDrop() throws InterruptedException {

        
        driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        WebElement frame=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/p/iframe"));
        driver.switchTo().frame(frame);
        WebElement Drag=driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
        
        WebElement Drop=driver.findElement(By.xpath("//div[@id='trash']"));
    //  Point location=  Drop.getLocation();
    // int x= location.x;
     //int y=location.y;
        Thread.sleep(2000);
       // action.dragAndDropBy(Drop, x, y)
       action.dragAndDrop(Drag, Drop).perform();

        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.in/");
        driver.findElement(By.xpath("//ul[@class='nav-ul']/li[6]/div")).click();
        Thread.sleep(2000);
        
       
        
        driver.quit();
    }
}
