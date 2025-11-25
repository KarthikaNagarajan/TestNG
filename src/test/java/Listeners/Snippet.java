package Listeners;



import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Snippet {
	@Test(priority=1)
		public void demo() {
			System.out.println("demo");
		}
	@Test(timeOut = 1000)
	public void demo1() throws InterruptedException {
	    Thread.sleep(5000);
	    System.out.println("demo1");
	}
		@Test(dependsOnMethods="demo1")
		public void demo2() {
			System.out.println("demo2");
		}
		@Test( priority = 4)
		public void demo3() {
			Assert.assertTrue(false);
			Assert.assertFalse(true);
		}
		@Test(timeOut = 1000, priority = 5)
		public void demo4() throws Throwable   {
		    Thread.sleep(5000);
		    System.out.println("demo4");
		}
	
}

