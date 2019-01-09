package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import utility.BrowserFactory;

public class EXHIBITOR_LOGIN extends BrowserFactory{

	@BeforeTest
	public void launchBrowser() {
		chromeBrowser();
		driver.get("https://id.kisanlab.com/accounts/org/login/?client_id=3a037a6d-be9a-43f8-8a30-6918fc93ad9e&client_secret=68eeec35-275e-42ed-8b4c-f062d53e3877&return_url=https://net.kisanlab.com/");
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
