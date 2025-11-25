package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failscenarious.txt",glue="stepDefinations",monochrome=true,
plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json", "rerun:target/failscenarious.txt"})
		


public class TestnngTest_runnerfail extends AbstractTestNGCucumberTests {
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {              // Corrected method name
	        return super.scenarios();
	    }

}
