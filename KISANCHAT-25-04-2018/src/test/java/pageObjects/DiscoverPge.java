package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BaseClass;
import utility.DataFile;

public class DiscoverPge extends BaseClass{

	public DiscoverPge(WebDriver driver) {
		super(driver);
	}
	
	By filterBtn = By.xpath("//*[@id=\"lightgrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[2]/div/div[3]/div[2]/div");
	By searchBtn = By.xpath("//*[@id=\"lightgrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[2]/div/div[3]/div[1]/div/input");
	By closeBtn = By.xpath("//*[@id=\"lightgrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[1]/div/a");
	By searchEdit = By.xpath("//*[@id=\"lightgrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[2]/div/div[3]/div[1]/div/div/input");
	By searchClose = By.xpath("//*[@id=\"lightgrayColorBody\"]/app-root/app-discover-channels/mat-sidenav-container/mat-sidenav-content/div/div/mat-list/mat-list-item[2]/div/div[3]/div[1]/div/div/div");
	
	DataFile input = new DataFile(driver);
	
	public void click_filterBtn() {
		waitTillElementClickable(filterBtn);
		driver.findElement(filterBtn).click();
	}
	
	public void searchChnl() throws Exception {
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
}
