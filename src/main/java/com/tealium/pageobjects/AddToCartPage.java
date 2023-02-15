package com.tealium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tealium.actiondriver.Action;
import com.tealium.base.BaseClass;

public class AddToCartPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='configurable_swatch_color']/li/a/span/img")
	WebElement colorCheckBox;
	
	@FindBy(xpath="//*[@id='configurable_swatch_shoe_size']/li[3]/a/span[1]")
	WebElement shoeSize;
	
	
	
	@FindBy(xpath="//*[@class='add-to-cart']/div/input")
	WebElement shoeQuantity;
	
	@FindBy(xpath="//*[@class='add-to-cart-buttons']/button")
	WebElement addToCartBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void selectColorCheckBox() {
		Action.click(getDriver(), colorCheckBox);
	}
	
	public void selectShoeSize() {
		Action.click(getDriver(), shoeSize);
	}
	
	public void selectShoeQuantity(String qnty) {
		Action.type(shoeQuantity, qnty);
	}
	
	public ShippingCartPage clickOnAddToCart() {
		Action.click(getDriver(), addToCartBtn);
		return new ShippingCartPage();
	}
	
	
	
}
