package com.tealium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tealium.actiondriver.Action;
import com.tealium.base.BaseClass;

public class IndexPage extends BaseClass{
	
	@FindBy(xpath="//header/div[1]/a[1]/img[1]")
	WebElement myTealiumLogo;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchProductBox;
	
	@FindBy(xpath="//*[@id=\"search_mini_form\"]/div[1]/button")
	WebElement searchProductButton;
	
	@FindBy(xpath="//a[@class='skip-link skip-account']")
	WebElement accountBtn;
	
	@FindBy(xpath="//*[@id='header-account']/div/ul/li[6]")
	WebElement loginBtn;
	
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public boolean validateMyLogo() {
		return Action.isDisplayed(getDriver(), myTealiumLogo);
	}
	
	public String getMyTitle() {
		String myActualTitle=getDriver().getTitle();
		return myActualTitle;
	}
	
	
	public LoginPage clickOnAccount() {
		Action.click(getDriver(), accountBtn);
		Action.fluentWait(getDriver(), accountBtn, 10);
		Action.click(getDriver(), loginBtn);
		return new LoginPage();
	}
	
	
	
	
	
	
	

}
