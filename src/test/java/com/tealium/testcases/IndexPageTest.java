 package com.tealium.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tealium.base.BaseClass;
import com.tealium.pageobjects.IndexPage;
import com.tealium.utilities.Log;

public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	
	

	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setUp() {
		launchApp();
	}
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(groups = "Smoke")
	public void verifyMyLogo() {
		Log.startTestCase("verifyMyLogo");
		IndexPage indexPage=new IndexPage();
		Log.info("Tealium logo is validated");
		boolean result=indexPage.validateMyLogo();
		Assert.assertTrue(result);
		Log.endTestCaseName("verifyMyLogo");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
