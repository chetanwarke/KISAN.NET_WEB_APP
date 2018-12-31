package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BaseClass;

public class WelcomeDashboardPage extends BaseClass{
	
	By leftDrawerBtn = By.cssSelector("#greenColorBody > app-root > app-welcome-dashboard > div > div > mat-sidenav-container > mat-sidenav-content > nav > mat-toolbar > button");
	By discoverBtn = By.cssSelector("#greenColorBody > app-root > app-welcome-dashboard > div > div > mat-sidenav-container > mat-sidenav-content > nav > mat-toolbar > mat-list > mat-icon:nth-child(1) > button");
	By notification = By.cssSelector("#greenColorBody > app-root > app-welcome-dashboard > div > div > mat-sidenav-container > mat-sidenav-content > nav > mat-toolbar > mat-list > mat-icon:nth-child(2) > button");
	By menuBtn = By.cssSelector("#greenColorBody > app-root > app-welcome-dashboard > div > div > mat-sidenav-container > mat-sidenav-content > nav > mat-toolbar > mat-list > mat-icon:nth-child(3) > button");
	By startDiscoveringLink = By.cssSelector("#greenColorBody > app-root > app-welcome-dashboard > div > div > mat-sidenav-container > mat-sidenav-content > section > div > div > a");
	
	public WelcomeDashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public void listChannels() {
		List <WebElement> chs = driver.findElements(By.cssSelector("span[class='limitChannelName']"));
		System.out.println("Total no of channels on mychat : "+chs.size());
		int i=1;
		for(WebElement we : chs)
		{
			System.out.println(i+" : "+we.getText());	
			i++;
		}
	}
	
	public void listChannelsDetails() {
		List <WebElement> chs = driver.findElements(By.cssSelector("span[class='limitChannelName']"));
		
		System.out.println("Total no of channels on mychat : "+chs.size());
		int i=1;
		for(WebElement we : chs)
		{
			System.out.println(i+" : "+we.getText());	
			i++;
		}
	}
	
	public void click_leftDrawerBtn() {
		waitTillElementPresent(leftDrawerBtn);
		driver.findElement(leftDrawerBtn).click();
	}
	
	public void click_discoverBtn() {
		waitTillElementPresent(discoverBtn);
		driver.findElement(discoverBtn).click();
	}
	
	public void click_notification() {
		waitTillElementPresent(notification);
		driver.findElement(notification).click();
	}
	
	public void click_menuBtn() {
		waitTillElementPresent(menuBtn);
		driver.findElement(menuBtn).click();
	}
	
	public void click_startDiscoveringLink() throws Exception {
		Thread.sleep(4000);
		waitTillElementPresent(startDiscoveringLink);
		driver.findElement(startDiscoveringLink).click();
	}

}
