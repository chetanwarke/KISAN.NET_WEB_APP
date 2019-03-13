package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BaseClass;
import utility.DataFile;

public class DiscoverPage extends BaseClass{

	public DiscoverPage(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	
	By gotItBtn = By.xpath("//button/span[contains(text(),'Got It')]");
	By filterBtn = By.xpath("//*[@id=\"lightgrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[2]/div/div[3]/div[2]/div");
	By searchBtn = By.xpath("//input[@class='search-btn ib-m']");
	By closeBtn = By.xpath("//*[@id=\"lightgrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[1]/div/a");
	By searchEdit = By.xpath("//*[@id=\"lightergrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[2]/div/div[3]/div[1]/div/div/input");
	By searchClose = By.xpath("//*[@id=\"lightergrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[2]/div/div[3]/div[1]/div/div/div");
	By closeDiscover = By.xpath("//i[@class=\"zmdi zmdi-close\"]");
	//for follow channel from discover
//	String channelName = "test";
//	By chName = By.xpath("//mat-card-content/h4[contains(text(),'"+channelName+"')]");
	By followArrowBtn = By.xpath("//i[@class=\"zmdi zmdi-arrow-right\"]");
	
	DataFile input = new DataFile(driver);
	
	public void click_gotItBtn() throws Exception{
//		waitForPageLoad(gotItBtn);
		Thread.sleep(3000);
		waitForLoader();
		waitTillElementClickable(gotItBtn);
		driver.findElement(gotItBtn).click();
	}
	
	public void click_filterBtn() throws Exception {
		waitForLoader();
		Thread.sleep(3000);
		waitTillElementClickable(filterBtn);
		driver.findElement(filterBtn).click();
	}
	
	public void searchChnl() throws Exception {
		waitForLoader();
		Thread.sleep(7000);
		//clicking on search button
		waitTillElementClickable(searchBtn);
		driver.findElement(searchBtn).click();
		//type in search input 
		waitTillElementPresent(searchEdit);
		driver.findElement(searchEdit).click();
		driver.findElement(searchEdit).clear();
		
		//set the channel name in search input field from excel (data) file 
		String chnlName = input.readTextInput("Channel", 3, 0);
		setText(searchEdit, chnlName);
		
	}
	
	public void followChnl() throws Exception {
		String chnlName = input.readTextInput("Channel", 4, 0);
		waitTillElementClickable(By.xpath("//mat-card-content/h4[contains(text(),'"+chnlName+"')]\""));
		driver.findElement(By.xpath("//mat-card-content/h4[contains(text(),'"+chnlName+"')]\"")).click();
		
		waitTillElementClickable(followArrowBtn);
		driver.findElement(followArrowBtn).click();
	}
	
	public void closeDiscover() {
		waitTillElementClickable(closeBtn);
		driver.findElement(closeBtn).click();
	}
}
