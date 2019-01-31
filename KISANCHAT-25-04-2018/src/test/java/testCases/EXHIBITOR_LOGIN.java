package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import utility.BrowserFactory;

public class EXHIBITOR_LOGIN extends BrowserFactory{

	@BeforeTest
	public void launchBrowser() {
		chromeBrowser();
//		driver.get("https://id.kisanlab.com/accounts/org/login/?client_id=3a037a6d-be9a-43f8-8a30-6918fc93ad9e&client_secret=68eeec35-275e-42ed-8b4c-f062d53e3877&return_url=https://net.kisanlab.com/");
		driver.get("https://id.kisan.in/accounts/org/login/?client_id=a40e14c7-c988-4142-9e24-897b0d203817&client_secret=4e01c5a9-5735-479d-acdb-48d8df18f5dc&return_url=https://net.kisan.in/");
		
	}
	
	@Test
	public void loginAsExhibitor() throws Exception {
		LoginPage lp = new LoginPage(driver);
//		lp.closeIFrame();
//		lp.click_exhLogin();
		lp.set_exhUsername();
		lp.set_exhPassword();
		lp.click_exhSubmit();
		Thread.sleep(5000);
	}
}

