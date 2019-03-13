package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.DiscoverPage;
import utility.BrowserFactory;

public class FOLLOW_CHNL_DISCOVER extends BrowserFactory {
	@BeforeTest
	public void welcomeDashboard() {
		driver.get("https://net.kisanlab.com/#/channels-list");
	}
	
	@Test
	public void follow() throws Exception {
		DiscoverPage dp = new DiscoverPage(driver);
		dp.followChnl();
	}

}
