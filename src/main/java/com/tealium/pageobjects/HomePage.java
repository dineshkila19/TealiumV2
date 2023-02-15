package com.tealium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tealium.actiondriver.Action;
import com.tealium.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchProductBox;
	
	@FindBy(xpath="//*[@id=\"search_mini_form\"]/div[1]/button")
	WebElement searchBoxBtn;
	
	@FindBy(xpath="//*[@class='nav-primary']/li[3]/a")
	WebElement accessories;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public SearchReasultPage searchProduct(String productName) {
		Action.type(searchProductBox, productName);
		Action.click(getDriver(), searchBoxBtn);
		return new SearchReasultPage();
		
	}
	
	public boolean validateAccessories() {
		return Action.isDisplayed(getDriver(), accessories);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
