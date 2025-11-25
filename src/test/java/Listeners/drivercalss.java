package Listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class drivercalss extends BaseTest{
	@Test(dataProvider="logindata",dataProviderClass=ExcelData.class)
	public void logintest(String username,String Password) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);
		System.out.println("username "+username +"password: "+Password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
;		Thread.sleep(5000);
		String text=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p' and text()='Time at Work']")).getText();
		System.out.println(text);
		driver.quit();
	}

}
