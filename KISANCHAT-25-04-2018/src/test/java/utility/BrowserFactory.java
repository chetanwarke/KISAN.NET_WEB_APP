package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory{
	public static WebDriver driver;
	
	public void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\KISANCHAT-25-04-2018-20181224T063325Z-001\\KISANCHAT-25-04-2018\\browser-drivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("http://net.kisanlab.com");
		driver.manage().window().maximize();
	
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\KISANCHAT-25-04-2018-20181224T063325Z-001\\KISANCHAT-25-04-2018\\browser-drivers\\geckodriver.exe");
		driver =  new FirefoxDriver();
		driver.get("http://net.kisanlab.com");
		
	}

}
