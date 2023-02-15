package com.tealium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tealium.actiondriver.Action;
import com.tealium.base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	@FindBy(xpath="//div[@class='buttons-set']/a")
	WebElement createAccountBtn;
	
	@FindBy(id="email")
	WebElement txtLoginEmail;
	
	@FindBy(id="pass")
	WebElement txtLoginPassword;
	
	@FindBy(id="send2")
	WebElement loginSubmitBtn;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public AccountCreationPage clickOnCreateAccount() {
		Action.click(getDriver(), createAccountBtn);
		return new AccountCreationPage();
	}
	
	public HomePage login(String uname, String upwd) {
		Action.type(txtLoginEmail, uname);
		Action.type(txtLoginPassword, upwd);
		Action.click(getDriver(), loginSubmitBtn);
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
