package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\feauture",glue="stepDefinations",monochrome=true,
plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json", "rerun:target/failscenarious.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags="@basic")
		


public class TestngTest_runner extends AbstractTestNGCucumberTests {
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {              // Corrected method name
	        return super.scenarios();
	    }

}
