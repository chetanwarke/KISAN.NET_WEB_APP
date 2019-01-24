package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import utility.BrowserFactory;

public class VISITOR_LOGIN extends BrowserFactory{
	
	@BeforeTest
		public void launchBrowser() {
		chromeBrowser();
		driver.get("https://net.kisan.in");
	}

	@Test
		public void loginSteps() throws Exception {

			LoginPage lp = new LoginPage(driver);
//			lp.click_enterMobile();
			Thread.sleep(3000);
			lp.iFrame();
			Thread.sleep(2000);
//			lp.set_countryCode();
			lp.set_enterIFrameMobile();
			lp.click_next();
			lp.click_enterOTPTextBox();
			lp.click_continueOTP();
			Thread.sleep(10000);
			
		}
	@AfterTest
	public void defaultContent() throws Exception {
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
}

