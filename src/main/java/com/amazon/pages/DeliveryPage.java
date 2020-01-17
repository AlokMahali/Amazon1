package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class DeliveryPage extends TestBase {
	
	@FindBy(xpath="//ul[@class='displayAddressUL']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='shipToThisAddress'][1]")
	WebElement Delivery;
	
	public DeliveryPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void getAddressDetails() {
		String DeliveryAddress =Address.getText();
		System.out.println("Given Address details : "+ DeliveryAddress);
	}
	
	
	public DeliveryAndPaymentPage deliverytoAddress() {
		Delivery.click();
		System.out.println("Successfully navigate to payment page");
		
		return new DeliveryAndPaymentPage();
	}
	

}
