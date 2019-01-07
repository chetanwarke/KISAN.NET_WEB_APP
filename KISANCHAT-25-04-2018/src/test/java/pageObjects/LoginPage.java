package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BaseClass;
import utility.DataFile;

public class LoginPage extends BaseClass{

//	By enterMobile = By.xpath("//*[@id=\"mat-input-0\"]");
	By iframe = By.xpath("//*[@id=\"greenColorBody\"]/div[1]/iframe");
//	By countryBox =  By.cssSelector("#u_0_4 > span");
//	By countryCode = By.cssSelector("div[data-tooltip-content=\"India\"]");
	By enterIFrameMobile = By.xpath("//*[@id=\"u_0_6q\"]");
	By next = By.xpath("//*[@id=\"u_0_6r\"]"); //button[contains(text(),'Next')]
	By continueOTP = By.xpath("//*[@id=\"u_0_4\"]"); //button[contains(text(),'Continue')]
	By enterOTPTextBox = By.xpath("//*[@id=\"u_0_3\"]");
//	String country = "India";
	
	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//clicking on entermobile textbox
//	public void click_enterMobile() throws Exception {
//		waitTillElementPresent(enterMobile);
//		driver.findElement(enterMobile).click();
//		
//	}
	//Switch to iframe
	public void iFrame() throws Exception {
		Thread.sleep(4000);
		WebElement element = driver.findElement(iframe);
		driver.switchTo().frame(element);
	}
	//set country code
//	public void set_countryCode() throws Exception {
//		driver.findElement(countryBox).click();
//		Thread.sleep(3000);
//		driver.findElement(countryCode).click();
//	}
	
	//set user mobile number
	public void set_enterIFrameMobile() throws Exception {
		driver.findElement(enterIFrameMobile).click();
		DataFile input = new DataFile(driver);
//		input.openExcelFile();
		String mobNumber = input.readTextInput("Login",1,0);	//readNumberInput(rowID, colID)
		setText(enterIFrameMobile, mobNumber);
	}
	
	//Click on Next button after entering mobile number
	public void click_next() {
		waitTillElementClickable(next);
		driver.findElement(next).click();
	}
	
	public void click_enterOTPTextBox() {
		waitTillElementPresent(enterOTPTextBox);
		driver.findElement(enterOTPTextBox).click();
	}
	//Click on Continue button after entering otp
	public void click_continueOTP() {
		waitTillElementClickable(continueOTP);
		driver.findElement(continueOTP).click();
	}
}
