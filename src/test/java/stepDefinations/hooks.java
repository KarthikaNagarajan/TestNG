package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Textcontextsetup;

public class hooks {
public WebDriver driver;
	
	//public String gettext;
Textcontextsetup textcontextsetup;
public hooks(Textcontextsetup textcontextsetup) {
	this.textcontextsetup=textcontextsetup;

}
	
	
	@Before("@Netbanking")
	public void netbanling() {
		System.out.println("********************************");
		System.out.println("net banking");
		
	}
	@Before("@HDFC")
	public void HDFC() {
		System.out.println("************************************");
		System.out.println("HDFC banking");
	}
	@After
	public void cleratrash() throws IOException {
		textcontextsetup.testbase.WebDriverManager().quit();
		
	}

}
