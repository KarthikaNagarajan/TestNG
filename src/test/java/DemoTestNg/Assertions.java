package DemoTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	
	SoftAssert softAssert=new SoftAssert();
	
	
	@Test
	public void Soft_Assertion() {
		String str="venkatesh";
		String str1="venkatesh";
		softAssert.assertEquals(str, str1);
		softAssert.assertAll();
		

		
		
	}

}
