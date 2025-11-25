package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObejects.PageObjectmanager;

public class Textcontextsetup {
	public WebDriver driver;
	public String product_name;
	public TestBase testbase;
	public Generic_utils generic_utils;
	
	
	public PageObjectmanager pageObjectmanager;
	public Textcontextsetup() throws IOException {
		testbase=new TestBase();
		generic_utils=new Generic_utils(testbase.WebDriverManager());
		
		pageObjectmanager=new PageObjectmanager(testbase.WebDriverManager());
		
	}
}
