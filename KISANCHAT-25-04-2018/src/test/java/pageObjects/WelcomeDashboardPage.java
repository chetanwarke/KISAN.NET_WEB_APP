package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BaseClass;
import utility.DataFile;

public class WelcomeDashboardPage extends BaseClass{
	
	By leftDrawerBtn = By.xpath("//*[@id=\"greenColorBody\"]/app-root/app-welcome-dashboard/div/div/mat-sidenav-container/mat-sidenav-content/nav/mat-toolbar/button");
	By discoverBtn = By.xpath("//*[@id=\"greenColorBody\"]/app-root/app-welcome-dashboard/div/div/mat-sidenav-container/mat-sidenav-content/nav/mat-toolbar/mat-list/mat-icon[1]");
	By notification = By.xpath("//*[@id=\"greenColorBody\"]/app-root/app-welcome-dashboard/div/div/mat-sidenav-container/mat-sidenav-content/nav/mat-toolbar/mat-list/mat-icon[2]");
	By menuBtn = By.xpath("//*[@id=\"greenColorBody\"]/app-root/app-welcome-dashboard/div/div/mat-sidenav-container/mat-sidenav-content/nav/mat-toolbar/mat-list/mat-icon[3]");
	By startDiscoveringLink = By.xpath("//*[@id=\"lightergrayColorBody\"]/app-root/app-welcome-dashboard/div/div/mat-sidenav-container/mat-sidenav-content/section/div/div/a");
	
	DataFile file = new DataFile(driver);
	
	public WelcomeDashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public void listChannels() throws Exception {
		List <WebElement> chs = driver.findElements(By.cssSelector("span[class='limitChannelName ng-star-inserted']"));
		System.out.println("Total no of channels on mychat : "+chs.size());
		int i=1;
		
		for(WebElement we : chs)
		{
			String valueToWrite = we.getText();
			file.writeTextInput("MyChatList", valueToWrite);
			System.out.println(i+" : "+we.getText());	
			i++;
		}
	}
	
	public void listChannelsDetails() {
		List <WebElement> chs = driver.findElements(By.cssSelector("span[class='limitChannelName ng-star-inserted']"));
		
		System.out.println("Total no of channels on mychat : "+chs.size());
		int i=1;
		for(WebElement we : chs)
		{
			System.out.println(i+" : "+we.getText());	
			i++;
		}
	}
	
	public void clickOnChannel(String chanlName) throws Exception
	{
		file.readTextInput("MyChatList", 0, 0);
		
		
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
