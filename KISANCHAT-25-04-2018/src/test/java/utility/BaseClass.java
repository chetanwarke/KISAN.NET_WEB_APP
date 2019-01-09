package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass extends BrowserFactory{
	//public WebDriver driver;
	//constructor
	public BaseClass(WebDriver driver) {
		BrowserFactory.driver = driver;
	}
	// wait for element to appears
	public WebDriverWait waitTillElementPresent(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		wait.until(ExpectedConditions.presenceOfElementLocated((By) we));
		return wait;
	}
	// wait for element to be clickable
	public WebDriverWait waitTillElementClickable(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
//		wait.until(ExpectedConditions.elementToBeClickable((By) we));
		return wait;
	}
	// submit/enter text in text field/text area
	public void setText(By locator, String text)
	{           
		driver.findElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(text).perform();
	}
	// submit/enter number in number field
	public void setNumber(By locator, double number)
	{           
		driver.findElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(String.valueOf(number)).perform();
	}
}
