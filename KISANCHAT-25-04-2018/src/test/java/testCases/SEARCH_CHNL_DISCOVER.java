package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.DiscoverPage;
import pageObjects.WelcomeDashboardPage;
import utility.BrowserFactory;

public class SEARCH_CHNL_DISCOVER extends BrowserFactory{
	
	@BeforeTest
	public void clickDiscoverBtn() throws Exception {
		WelcomeDashboardPage wd = new WelcomeDashboardPage(driver);
		wd.click_discoverBtn();
	}
	
	@Test
	public void searchChnl() throws Exception {
		DiscoverPage dp = new DiscoverPage(driver);
//		WelcomeDashboardPage wd = new WelcomeDashboardPage(driver);
//		wd.click_discoverBtn();
		dp.click_gotItBtn();
		Thread.sleep(3000);
		dp.searchChnl();
		
		
	}

}
