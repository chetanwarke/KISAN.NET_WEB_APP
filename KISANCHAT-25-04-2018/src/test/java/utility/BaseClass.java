package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass extends BrowserFactory{
	
	
	//public WebDriver driver;
	//constructor
	public BaseClass(WebDriver driver) {
		BrowserFactory.driver = driver;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	// wait for element to appears
	public WebDriverWait waitTillElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 65);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		wait.until(ExpectedConditions.presenceOfElementLocated((By) we));
		return wait;
	}
	
	// wait for element to be clickable
	public WebDriverWait waitTillElementClickable(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 65);
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
	
//	By loader = By.xpath("//*[@id=\"lightergrayColorBody\"]/div[2]");
	By loader = By.cssSelector("#lightergrayColorBody > div.loadingoverlay");
	
	public void waitForLoader()throws Exception {
		try
		{
		 if(driver.findElement(loader).isEnabled() && driver.findElement(loader).isDisplayed())
		 {
			WebDriverWait wait = new WebDriverWait(driver, 65);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		 }
		}
		 catch(Exception e)
		 {
			 System.out.println(e);
			 return;
		 }
	}
	
	public WebElement waitForPageLoad(By element) {
//		 Wait wait = new FluentWait(driver).withTimeout(30, SECONDS).pollingEvery(5, SECONDS).ignoring(NoSuchElementException.class);
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		 WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(loader));
		return ele;
	}
}
