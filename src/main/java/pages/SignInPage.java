package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class SignInPage extends ProjectSpecificWrappers {

	public SignInPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		

		// if(!verifyTitle("ToolsQA")){
		// reportStep("This is not Login Page", "Fail");
	}

	public SignInPage clickHelloSignIn() {
		clickById("nav-link-accountList");
		return this;

	}

	public SignInPage enterEmail(){
		enterById("ap_email", username);
		return this;
	}
	public SignInPage clickContinue() {
		clickById("continue");
		return this;
	}

	public SignInPage enterPassword(){
		enterById("ap_password", password);
		return this;
	}
	
	public SearchPage clickSignIn() throws InterruptedException {
		clickById("signInSubmit");
		Thread.sleep(20000);
		return new SearchPage(driver,test);

	}
}