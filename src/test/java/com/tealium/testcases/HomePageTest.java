package com.tealium.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tealium.base.BaseClass;
import com.tealium.pageobjects.AccountCreationPage;
import com.tealium.pageobjects.HomePage;
import com.tealium.pageobjects.IndexPage;
import com.tealium.pageobjects.LoginPage;
import com.tealium.pageobjects.SearchReasultPage;
import com.tealium.utilities.Log;

public class HomePageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	AccountCreationPage accountCreationPage;
	//ProductAvailabilityPage productAvailabilityPage;
	SearchReasultPage searchReasultPage;
	
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setUp() {
		launchApp();
	}
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(groups = "Smoke")
	public void HomePageTest() {
		Log.startTestCase("HomePageTest");
		IndexPage indexPage=new IndexPage();
		Log.info("Click on Account to login");
		loginPage=indexPage.clickOnAccount();
		Log.info("Successfully entered Valid Email and Password");
		homePage=loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("Enter Product name like LOAFER");
		searchReasultPage=homePage.searchProduct("LOAFER");
		Log.endTestCaseName("HomePageTest");
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
