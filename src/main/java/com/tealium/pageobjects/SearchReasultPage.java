package com.tealium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tealium.actiondriver.Action;
import com.tealium.base.BaseClass;

public class SearchReasultPage extends BaseClass{
	
	
	
	@FindBy(xpath="//*[@class='option-blue is-media']/a/span/img")
	WebElement imgCheckBox;
	
	@FindBy(xpath="//*[@class='actions']/a")
	WebElement viewDetailsBtn;
	
	public SearchReasultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public AddToCartPage clickOnViewDetails() {
		Action.click(getDriver(), imgCheckBox);
		Action.click(getDriver(), viewDetailsBtn);
		return new AddToCartPage();
	}
	
	
	
	
	
	
	
	
	
	
	

}
