package testCases;

import org.testng.annotations.Test;

import pageObjects.WelcomeDashboardPage;
import utility.BrowserFactory;

public class LIST_CHANNELS extends BrowserFactory {

	@Test
	public void channelList() throws Exception {
//		driver.get("http://net.kisanlab.com/#/welcome-dashboard");
		WelcomeDashboardPage wd = new WelcomeDashboardPage(driver);
		wd.listChannels();
		
//		wd.click_startDiscoveringLink();
	}

}
