package com.tealium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tealium.actiondriver.Action;
import com.tealium.base.BaseClass;

public class AccountCreationPage extends BaseClass{
	
	@FindBy(id="firstname")
	WebElement txtFirstName;
	
	@FindBy(id="middlename")
	WebElement txtMiddleName;
	
	@FindBy(id="lastname")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='confirmation']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@id='is_subscribed']")
	WebElement chechBox;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement registerBtn;
	
	public AccountCreationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void setFirstName(String fname) {
		Action.type(txtFirstName, fname);
	}
	
	public void setMiddleName(String mname) {
		Action.type(txtMiddleName, mname);
	}
	
	public void setLastName(String lname) {
		Action.type(txtLastName, lname);
	}
	
	public void setEmail(String uemail) {
		Action.type(txtEmail, uemail);
	}
	
	public void setPassword(String upwd) {
		Action.type(txtPassword, upwd);
	}
	
	public void setConfirmPwd(String cpwd) {
		Action.type(txtConfirmPassword, cpwd);
	}
	
	public void clickOnCheckBox() {
		Action.click(getDriver(), chechBox);
	}
	
	public HomePage clickOnRegister() {
		Action.click(getDriver(), registerBtn);
		return new HomePage();
	}
	
	
	
	
	
	
	

	
	
	
	
	

}
