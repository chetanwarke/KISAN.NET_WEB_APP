package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BaseClass;
import utility.DataFile;

public class LoginPage extends BaseClass{

//	By enterMobile = By.xpath("//*[@id=\"mat-input-0\"]");
	By iframe = By.xpath("//*[@id=\"greenColorBody\"]/div[1]/iframe");
	By closeiframe = By.xpath("//*[@id=\"u_0_1\"]/div[2]/svg");
//	By countryBox =  By.cssSelector("#u_0_4 > span");
//	By countryCode = By.cssSelector("div[data-tooltip-content=\"India\"]");
	By enterIFrameMobile = By.xpath("//*[@id=\"u_0_6q\"]");
	By next = By.xpath("//*[@id=\"u_0_6r\"]"); //button[contains(text(),'Next')]
	By continueOTP = By.xpath("//*[@id=\"u_0_4\"]"); //button[contains(text(),'Continue')]
	By enterOTPTextBox = By.xpath("//input[@name='confirmation_code']");
	
	By exhLogin = By.xpath("//a[contains(text(),'Exhibitor Login')]");
	By exhUsername = By.xpath("//*[@id=\"username\"]");
	By exhPassword = By.xpath("//*[@id=\"password\"]");
	By exhSubmit = By.xpath("//*[@id=\"org_login\"]/div[7]/div/input");
	
//	String country = "India";
	
	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
   /* define the datafile object 	*/
	DataFile input = new DataFile(driver);
	
	//clicking on entermobile textbox
//	public void click_enterMobile() throws Exception {
//		waitTillElementPresent(enterMobile);
//		driver.findElement(enterMobile).click();	
//	}
	
	//Switch to iframe
	public void iFrame() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementPresent(iframe);
		Thread.sleep(3000);
		WebElement element = driver.findElement(iframe);
		driver.switchTo().frame(element);
	}
	
	public void closeIFrame() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementPresent(iframe);
		Thread.sleep(2000);
		WebElement element = driver.findElement(iframe);
		driver.switchTo().frame(element);
		waitTillElementClickable(closeiframe);
		driver.findElement(closeiframe).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	
//	set set country code 
//	public void set_countryCode() throws Exception {
//		driver.findElement(countryBox).click();
//		Thread.sleep(3000);
//		driver.findElement(countryCode).click();
//	}
	
	//set user mobile number
	public void set_enterIFrameMobile() throws Exception {
		driver.findElement(enterIFrameMobile).click();
		/*DataFile input = new DataFile(driver);*/
//		input.openExcelFile();
		String mobNumber = input.readTextInput("Login",1,0);	//readNumberInput(rowID, colID)
		setText(enterIFrameMobile, mobNumber);
	}
	
	//Click on Next button after entering mobile number
	public void click_next() {
		waitTillElementClickable(next);
		driver.findElement(next).click();
	}
	
	public void click_enterOTPTextBox() throws Exception {
		
		waitTillElementClickable(enterOTPTextBox);
		Thread.sleep(3000);
		driver.findElement(enterOTPTextBox).click();
	}
	//Click on Continue button after entering otp
	public void click_continueOTP() {
		waitTillElementClickable(continueOTP);
		driver.findElement(continueOTP).click();
	}
	
	public void click_exhLogin() {
		waitTillElementPresent(exhLogin);
		waitTillElementClickable(exhLogin);
		driver.findElement(exhLogin).click();	
	}
	
	public void set_exhUsername() throws Exception {
		waitTillElementPresent(exhUsername);
		driver.findElement(exhUsername).click();	
//		for test site
//		String uname = input.readTextInput("Login", 2, 4);
//		for live site
		String uname = input.readTextInput("Login", 1, 4);
		setText(exhUsername, uname);
		
	}
	
	public void set_exhPassword() throws Exception {
		waitTillElementPresent(exhPassword);
		driver.findElement(exhPassword).click();
//		for test site
//		String pass = input.readTextInput("Login", 2, 5);
//		for live site
		String pass = input.readTextInput("Login", 1, 5);
		setText(exhPassword, pass);
	}
	
	public void click_exhSubmit() {
		waitTillElementClickable(exhSubmit);
		driver.findElement(exhSubmit).click();
	}
}
