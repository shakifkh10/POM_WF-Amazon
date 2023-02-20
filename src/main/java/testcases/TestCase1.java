package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SignInPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase1 extends ProjectSpecificWrappers {
	@BeforeClass
	public void setData() throws InterruptedException {
		testCaseName="TestCase1";
		testDescription="Sign in and add bed to cart, delete it, and then add a lamp to cart and then delete it";
		browserName="chrome";
		dataSheetName="Items";
		category="Smoke";
		authors="Tawfiq";
	
	}
	
	
	@Test(dataProvider="fetchData")
	public void testCase1(String searchText) throws InterruptedException {
		System.out.println("Running TestCase1 to search for item "+ searchText);
		new SignInPage(driver, test)
		.clickHelloSignIn()
		.enterEmail()
		.clickContinue()
		.enterPassword()
		.clickSignIn()
		.enterSearch(searchText)
		.clickSearch()
		.clickSearchResult(item)
		.clickAddtoCart()
		.clickCart()
		.clickDelete()
		.quit();
		}

	
}
