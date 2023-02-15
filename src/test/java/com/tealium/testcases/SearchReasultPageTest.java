package com.tealium.testcases;

import org.testng.Assert;
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

public class SearchReasultPageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	AccountCreationPage accountCreationPage;
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
	public void searchResultProductTest() {
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnAccount();
		homePage=loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		searchReasultPage=homePage.searchProduct("LOAFER");
		searchReasultPage.clickOnViewDetails();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
