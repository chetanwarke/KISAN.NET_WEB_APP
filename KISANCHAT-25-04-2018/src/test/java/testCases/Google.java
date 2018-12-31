package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.BrowserFactory;

public class Google{
	WebDriver driver = null;
	@Test
	public void search() {
		BrowserFactory bf = new BrowserFactory();
		bf.chromeBrowser();
//		driver.get("https://www.google.co.in/");
		
	}

}
