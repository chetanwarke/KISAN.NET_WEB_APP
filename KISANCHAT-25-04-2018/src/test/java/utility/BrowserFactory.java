package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory{
	public static WebDriver driver;
	
	public void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\browser-drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\browser-drivers\\geckodriver.exe");
		driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		
	}

}
