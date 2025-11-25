package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic_utils {
	public WebDriver driver;
	public Generic_utils (WebDriver driver) {
		this.driver=driver;
	}
	
	public void windowhandles() {
	
		Set<String>W=	driver.getWindowHandles();
	    Iterator<String>it=	W.iterator();
	   String parent =it.next();
	   String child=it.next();
	   driver.switchTo().window(child);
		
	}

}
