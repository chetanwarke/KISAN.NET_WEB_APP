package utility;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory{
	public static WebDriver driver = null;
	
	public void chromeBrowser() {
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
	
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//1-Allow, 2-Block, 0-default
		options.setExperimentalOption("prefs",prefs);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\browser-drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

	}
	
	public void firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\browser-drivers\\geckodriver.exe");
		driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		
	}

}
