package com.tealium.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tealium.base.BaseClass;
import com.tealium.dataproviders.DataProviders;
import com.tealium.pageobjects.AccountCreationPage;
import com.tealium.pageobjects.HomePage;
import com.tealium.pageobjects.IndexPage;
import com.tealium.pageobjects.LoginPage;
import com.tealium.utilities.Log;

public class LoginPageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	AccountCreationPage accountCreationPage;
	
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setUp() {
		launchApp();
	}
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void loginTest(String email, String password) {
		Log.startTestCase("loginTest");
		IndexPage indexPage=new IndexPage();
		Log.info("User is going to Click on Account");
		loginPage=indexPage.clickOnAccount();
		Log.info("Enter Email and Password");
		//loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		loginPage.login(email, password);
		String actTitle=getDriver().getTitle();
		String expTitle="Customer Login";
		Log.info("Verifying User is able to Login ");
		Assert.assertEquals(actTitle, expTitle);
		Log.info("Login is Success");
		Log.endTestCaseName("loginTest");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
