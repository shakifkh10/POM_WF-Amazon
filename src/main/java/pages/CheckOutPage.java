package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class CheckOutPage extends ProjectSpecificWrappers {
	
	public CheckOutPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		this.item = item;

	}
	
	public CheckOutPage clickCart() throws InterruptedException{
		clickById("nav-cart");
		Thread.sleep(2000);
		return this;
		
	}
	
	public CheckOutPage clickDelete() throws InterruptedException {
		clickByXpath("//input[@value='Delete'] ");
		Thread.sleep(2000);
		return this;
	}
	
	/*
	 * public CheckOutPage verifyItem() throws InterruptedException {
	 * System.out.println(item);
	 * verifyTextByXpath("//span[@class='a-truncate-cut']", item);
	 * Thread.sleep(2000); return this; }
	 */
	
	/*
	 * public CheckOutPage closeBrowser() { { quitBrowser(); return this; }
	 */
	
	public CheckOutPage quit() {
		driver.quit();
		return this;
	}
		
		
		
}
