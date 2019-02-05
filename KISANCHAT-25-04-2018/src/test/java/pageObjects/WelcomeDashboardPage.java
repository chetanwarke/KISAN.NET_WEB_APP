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
	
	//for mychat list element to load all channels list
	By chnList = By.xpath("//*[@id=\"small-part-loader\"]");
	
	DataFile file = new DataFile(driver);
	
	public WelcomeDashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public void listChannels() throws Exception {
		Thread.sleep(6000);
		waitForLoader();
//		waitTillElementPresent((By) driver.findElement(chnList));
//		Thread.sleep(8000);
//		waitTillElementClickable(discoverBtn);
		Thread.sleep(5000);
		List <WebElement> chs = driver.findElements(By.cssSelector("span[class='limitChannelName ng-star-inserted']"));
		System.out.println("Total no of channels on mychat : "+chs.size());
		
		
		for(WebElement we : chs)
		{
			String valueToWrite = we.getText();
			file.writeTextInput("MyChatList", valueToWrite);
//			int i=1;
//			System.out.println(i+" : "+we.getText());	
//			i++;
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
		waitTillElementClickable(leftDrawerBtn);
		driver.findElement(leftDrawerBtn).click();
	}
	
	public void click_discoverBtn() throws Exception {
//		waitForLoader();
		waitTillElementClickable(discoverBtn);
		driver.findElement(discoverBtn).click();
	}
	
	public void click_notification() {
		waitTillElementClickable(notification);
		driver.findElement(notification).click();
	}
	
	public void click_menuBtn() {
		waitTillElementClickable(menuBtn);
		driver.findElement(menuBtn).click();
	}
	
	public void click_startDiscoveringLink() throws Exception {
		Thread.sleep(4000);
		waitTillElementClickable(startDiscoveringLink);
		driver.findElement(startDiscoveringLink).click();
	}

}
