package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class LeftDrawer extends BaseClass {

	public LeftDrawer(WebDriver driver) {
		super(driver);
	}
	By leftDrawerBtn = By.cssSelector("#greenColorBody > app-root > app-welcome-dashboard > div > div > mat-sidenav-container > mat-sidenav-content > nav > mat-toolbar > button > a:nth-child(1) > i");
	By closeBtn = By.cssSelector("#menuListSideNav > app-navigation-drawer > div > div > div.profile_heading > div > div > div.leftNavButton > div.leftArrow > a > i");
	By userProfileImage = By.cssSelector("#menuListSideNav > app-navigation-drawer > div > div > div.profile_heading > div > div > div.leftNavButton > div.circle-box.text-center.widthfull > a > img");
	By myChats = By.cssSelector("#container > perfect-scrollbar > div > div.ps-content > div > mat-nav-list > mat-list-item:nth-child(1) > div > a > span");
	By myContacts = By.cssSelector("#container > perfect-scrollbar > div > div.ps-content > div > mat-nav-list > mat-list-item:nth-child(2) > div > a > span");
	By startYourChannel = By.cssSelector("#container > perfect-scrollbar > div > div.ps-content > div > mat-nav-list > mat-list-item:nth-child(4) > div > a > span");
	By language = By.cssSelector("#container > perfect-scrollbar > div > div.ps-content > div > mat-nav-list > mat-list-item:nth-child(6) > div > a > span");
	By logout = By.cssSelector("#container > perfect-scrollbar > div > div.ps-content > div > mat-nav-list > mat-list-item:nth-child(8) > div > a > span");
	By logoutYes = By.cssSelector("#cdk-overlay-0 > mat-dialog-container > app-logout-popup > div > mat-dialog-actions > button.btnPopup.btnRed");
	By logoutNo = By.cssSelector("#cdk-overlay-0 > mat-dialog-container > app-logout-popup > div > mat-dialog-actions > button.btnPopup.btnBlack");
	
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
		waitTillElementPresent(myChats);
		driver.findElement(myChats).click();
	}
	
	public void click_myContacts() {
		waitTillElementPresent(myContacts);
		driver.findElement(myContacts).click();
	}
	
	public void click_startYourChannel() {
		waitTillElementPresent(startYourChannel);
		driver.findElement(startYourChannel).click();
	}
	
	public void click_language() {
		waitTillElementPresent(language);
		driver.findElement(language).click();
	}
	
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
