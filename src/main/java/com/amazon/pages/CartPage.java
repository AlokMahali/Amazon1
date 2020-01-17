package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Proceed to Buy (1 item)')]")
	WebElement ProceedToBuy;
	
	public CartPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage proceedtopay() {
		ProceedToBuy.click();
		return new LoginPage();
	}
	
	
	

}
