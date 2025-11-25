package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;
//@Test(retryAnalyzer = retry.class))
public class Demo extends BaseTest{

	@Test
	public void demo() throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		String title=driver.getTitle();
		String t="OrangeHRm";
		Assert.assertEquals(title, t);
		
	}
}
