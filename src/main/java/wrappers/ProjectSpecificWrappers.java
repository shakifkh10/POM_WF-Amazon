package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pages.SignInPage;
import utils.DataInputProvider;

public class ProjectSpecificWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	
	

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
		loadObjects();
	}
	
	@BeforeMethod
	
	public void beforeMethod() throws InterruptedException{
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);	
		invokeApp(browserName,false);
		 new SignInPage(driver, test) .clickHelloSignIn() .enterEmail()
		  .clickContinue() .enterPassword() .clickSignIn();
		 
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();
	}
	
	@AfterMethod
	public void afterMethod(){
		endTestcase();
		quitBrowser();
		
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);	
		
	}	
	
	public void login(){
		
	}
	
}






