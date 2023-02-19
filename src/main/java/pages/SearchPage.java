package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class SearchPage extends ProjectSpecificWrappers {

	public SearchPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		this.item = item;
		
		// if(!verifyTitle("ToolsQA")){
		// reportStep("This is not Books page", "Fail");
	}

	public SearchPage enterSearch(String searchText) {
		enterById("twotabsearchtextbox", searchText);
		return this;
	}

	public SearchPage clickSearch() {
		clickById("nav-search-submit-button");
		return this;
	}

	public SearchPage clickSearchResult(String item) throws InterruptedException{
		item = driver.findElementByXPath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']").getText();
		System.out.println(item);
		clickByXpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']");
		//clickByXpath("//div[@class='s-product-image-container aok-relative s-text-center s-image-overlay-grey s-padding-left-small s-padding-right-small puis-spacing-small s-height-equalized']");
		Thread.sleep(5000);
		return this;
		
	}
	
	public CheckOutPage clickAddtoCart(){
		clickById("add-to-cart-button");
		return new CheckOutPage(driver,test);
	
	}
	
	
}
	
	