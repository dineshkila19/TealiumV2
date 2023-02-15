package com.tealium.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.tealium.base.BaseClass;
import com.tealium.pageobjects.AccountCreationPage;
import com.tealium.pageobjects.IndexPage;
import com.tealium.pageobjects.LoginPage;
import com.tealium.utilities.Log;

public class AccountCreationPageTest extends BaseClass{
	IndexPage indexPage;
	AccountCreationPage accountCreationPage;
	LoginPage loginPage;
	
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setUp() {
		launchApp();
	}
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(groups = "Sanity")
	public void loginTealium() {
		Log.startTestCase("loginTealium");
		IndexPage indexPage=new IndexPage();
		Log.info("Click on Account to Create an Account");
		loginPage=indexPage.clickOnAccount();
		Log.info("Before creating account we click create account btn");
		accountCreationPage=loginPage.clickOnCreateAccount();
		Log.info("enter Firstname ");
		accountCreationPage.setFirstName("dinesh");
		Log.info("enter Middlename");
		accountCreationPage.setMiddleName("chinna");
		Log.info("enter Lastname");
		accountCreationPage.setLastName("kila");
		Log.info("enter Valid Email");
		accountCreationPage.setEmail("dineshkila@gmail.com");
		Log.info("enter valid Password");
		accountCreationPage.setPassword("dinesh19");
		Log.info("enter valid confirm Password");
		accountCreationPage.setConfirmPwd("dinesh19");
		Log.info("Before Creating Account we Click Check Box");
		accountCreationPage.clickOnCheckBox();
		accountCreationPage.clickOnRegister();
		String actTitle=getDriver().getTitle();
		String curTitle="Create New Customer Account";
		Log.info("Succesfully Created Account");
		Assert.assertEquals(actTitle, curTitle);
		Log.endTestCaseName("loginTealium");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
