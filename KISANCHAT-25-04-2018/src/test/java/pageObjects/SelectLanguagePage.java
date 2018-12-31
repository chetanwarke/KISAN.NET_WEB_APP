package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BaseClass;

public class SelectLanguagePage extends BaseClass{

	By english = By.xpath("//*[@id=\"greenColorBody\"]/app-root/app-select-language/section/div/div/mat-list/mat-list-item[1]/div");
	By hindi = By.xpath("//*[@id=\"greenColorBody\"]/app-root/app-select-language/section/div/div/mat-list/mat-list-item[3]/div");
	By marathi = By.xpath("//*[@id=\"greenColorBody\"]/app-root/app-select-language/section/div/div/mat-list/mat-list-item[2]/div");
	
	//constructor
	public SelectLanguagePage(WebDriver driver) {
		super(driver);
	}
	//select english language
	public void clickEnglish() {
		waitTillElementPresent(english);
		driver.findElement(english).click();
	}
	//select hindi language
	public void clickHindi() {
		driver.findElement(hindi).click();
	}

	// select mararhi language
	public void clickMararthi() {
		driver.findElement(marathi).click();
	}
}
