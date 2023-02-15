package com.tealium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tealium.actiondriver.Action;
import com.tealium.base.BaseClass;

public class ShippingCartPage extends BaseClass{
	
	@FindBy(xpath="//*[@class='first last odd']/td[3]/span[1]/span[1]")
	WebElement unitPrice;
	
	@FindBy(xpath="//*[@class='first last odd']/td[5]/span/span")
	WebElement totalPrice;
	
	
	@FindBy(xpath="//*[@id=\"top\"]/body/div[2]/div/div[2]/div/div/div[2]/div[1]/ul/li/button")
	WebElement proceedToCheckout;
	
	@FindBy(xpath="//*[@id=\"top\"]/body")
	WebElement continueBtn;
	
	public ShippingCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public double getUnitPrice() {
		String unitprice1=unitPrice.getText();
		String unit=unitprice1.replaceAll("[^a-zA-Z0-9]", " ");
		double finalUnitPrice=Double.parseDouble(unit);
		return finalUnitPrice/100;
	}
	
	public double getTotalPrice() {
		String totalprice1=totalPrice.getText();
		String total=totalprice1.replaceAll("[^a-zA-Z0-9]", " ");
		double finalTotalPrice=Double.parseDouble(total);
		return finalTotalPrice/100;
	}
	
	public CheckOutPage clickOnProceedToCheckout() {
		Action.fluentWait(getDriver(), proceedToCheckout, 10);
		Action.click(getDriver(), proceedToCheckout);
		Action.click(getDriver(), continueBtn);
		return new CheckOutPage();
	}
	

}
