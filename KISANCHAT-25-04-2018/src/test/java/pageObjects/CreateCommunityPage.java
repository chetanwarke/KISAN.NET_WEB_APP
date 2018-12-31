package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;
import utility.DataFile;

public class CreateCommunityPage extends BaseClass {

	public CreateCommunityPage(WebDriver driver) {
		super(driver);
	}

	By backArrowBtn = By.cssSelector("#header > div > mat-list > mat-list-item:nth-child(1) > div > a > i");
	By nextBtn = By.cssSelector("#header > div > mat-list > mat-list-item:nth-child(2) > div > a");
	By chnlImage = By.cssSelector("#myImg");
	By channelName = By.cssSelector("#channelName");
	By colorBucket = By.cssSelector("#greenColorBody > section > div > div.backColorBucket.mrgn-t-md.pad-t-sm");
	By colorBucketCode = By.cssSelector("#greenColorBody > section > div > div.backColorBucket.mrgn-t-md.pad-t-sm > color-picker > div > div.hex-text.ng-star-inserted > div:nth-child(1) > input");
	By colorBucketOkBtn = By.cssSelector("#greenColorBody > section > div > div.backColorBucket.mrgn-t-md.pad-t-sm > color-picker > div > div.button-area.ng-star-inserted > button.colorPickerBtn1.ng-star-inserted");
	By colrBucketCancelBtn = By.cssSelector("#greenColorBody > section > div > div.backColorBucket.mrgn-t-md.pad-t-sm > color-picker > div > div.button-area.ng-star-inserted > button.colorPickerBtn2.ng-star-inserted");

    public void click_backArrowBtn() {
    	waitTillElementPresent(backArrowBtn);
    	driver.findElement(backArrowBtn).click();
    }
    
    public void click_nextBtn() {
    	waitTillElementPresent(nextBtn);
    	driver.findElement(nextBtn).click();
    }
    
    public void upload_chnlImage() {
    	waitTillElementPresent(chnlImage);
    	driver.findElement(chnlImage);
    }
    
    public void set_channelName() throws Exception {
    	waitTillElementPresent(channelName);
    	DataFile file = new DataFile(driver);
    	String value = file.readTextInput("Channel",1, 0);
    	driver.findElement(channelName).click();
    	setText(channelName, value);
    }
    
    public void click_colorBucket() {
    	waitTillElementPresent(colorBucket);
    	driver.findElement(colorBucket);
    }
    
    public void set_colorBucketCode() {
    	waitTillElementPresent(colorBucketCode);
    	driver.findElement(colorBucketCode);
    }
    
    public void click_colorBucketOkBtn() {
    	waitTillElementPresent(colorBucketOkBtn);
    	driver.findElement(colorBucketOkBtn);
    }
    
    public void click_colrBucketCancelBtn() {
    	waitTillElementPresent(colrBucketCancelBtn);
    	driver.findElement(colrBucketCancelBtn);
    }

}
