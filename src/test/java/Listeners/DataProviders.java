package Listeners;

import org.openqa.selenium.By;import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviders extends BaseTest {
	@Test(dataProvider="logindata",dataProviderClass=ExcelData.class)
	public void logintest(String username,String Password) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
;		Thread.sleep(5000);
		String text=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p' and text()='Time at Work']")).getText();
		System.out.println(text);
		driver.quit();
	}
	@Test(dataProvider="testdata")
	public void logintest1(String username,String Password) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);
		
	}
	@DataProvider()
	public Object[][] logindata() {
		Object[][]data=new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="Admin";
		data[1][1]="admin1234";
		
		return data;
		
	}
	@DataProvider(name="testdata")
	public Object[][] logindata1() {
		Object[][]data=new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="Admin";
		data[1][1]="admin1234";
		
		return data;
		
	}
	

}
