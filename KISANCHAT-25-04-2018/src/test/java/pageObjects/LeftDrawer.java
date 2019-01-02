package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class LeftDrawer extends BaseClass {

	public LeftDrawer(WebDriver driver) {
		super(driver);
	}
	By leftDrawerBtn = By.xpath("//*[@id=\"greenColorBody\"]/app-root/app-welcome-dashboard/div/div/mat-sidenav-container/mat-sidenav-content/nav/mat-toolbar/button");
	By closeBtn = By.xpath("//*[@id=\"menuListSideNav\"]/app-navigation-drawer/div/div/div[1]/div/div/div[1]/div[1]/a");
	By userProfileImage = By.xpath("//*[@id=\"menuListSideNav\"]/app-navigation-drawer/div/div/div[1]/div/div/div[1]/div[2]/a");
	By home = By.xpath("//span[contains(text(),'Home')]");
	By discover = By.xpath("//span[contains(text(),'Discover')]");
//	By startYourChannel = By.cssSelector("#container > perfect-scrollbar > div > div.ps-content > div > mat-nav-list > mat-list-item:nth-child(4) > div > a > span");
//	By language = By.cssSelector("#container > perfect-scrollbar > div > div.ps-content > div > mat-nav-list > mat-list-item:nth-child(6) > div > a > span");
	By support = By.xpath("//span[contains(text(),'Support')]"); //(By.xpath("//*[contains(text(),'" + predefined string + "')]")) 
	By logout = By.xpath("//span[contains(text(),'Logout')]");
	By logoutYes = By.xpath("//button[contains(text(),' Yes')]");
	By logoutNo = By.xpath("//button[contains(text(),' No')]");
	
	public void click_leftDrawerBtn() {
		waitTillElementPresent(leftDrawerBtn);
		driver.findElement(leftDrawerBtn).click();
	}
	
	public void click_closeBtn() {
		waitTillElementPresent(closeBtn);
		driver.findElement(closeBtn).click();
	}
	
	public void click_userProfileImage() {
		waitTillElementPresent(userProfileImage);
		driver.findElement(userProfileImage).click();
	}
	
	public void click_myChats() {
		waitTillElementPresent(home);
		driver.findElement(home).click();
	}
	
	public void click_myContacts() {
		waitTillElementPresent(discover);
		driver.findElement(discover).click();
	}
	
//	public void click_startYourChannel() {
//		waitTillElementPresent(startYourChannel);
//		driver.findElement(startYourChannel).click();
//	}
//	
//	public void click_language() {
//		waitTillElementPresent(language);
//		driver.findElement(language).click();
//	}
//	
	public void click_logout() {
		waitTillElementPresent(logout);
		driver.findElement(logout).click();
	}
	
	public void click_logoutYes() {
		waitTillElementPresent(logoutYes);
		driver.findElement(logoutYes).click();
	}
	
	public void click_logoutNo() {
		waitTillElementPresent(logoutNo);
		driver.findElement(logoutNo).click();
	}
	

}
