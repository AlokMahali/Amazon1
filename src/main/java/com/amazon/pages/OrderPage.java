package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class OrderPage extends TestBase{

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement AddtoCart;
	
	@FindBy(name="submit.buy-now")
	WebElement BuyNow;
	
	@FindBy(xpath="//span[starts-with(@id,'priceblock')]")
	WebElement Price;
	
	@FindBy(xpath="//div[@id='nav-subnav']")
	WebElement tabsItem;
		
	@FindBy(xpath="//span[@id='productTitle']")
	WebElement ProductTitle;
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CartPage addtocart() {
		AddtoCart.click();
		return new CartPage();
	}
	
	public void BuyNow() {
		
		BuyNow.click();
		
	}
	
	public void getPrice() {
		
		String PriceofProd= Price.getText();
		System.out.println(PriceofProd);
		
	}
	
	public void TabItem() {
		String items = tabsItem.getText();
		System.out.println(items);
	}
	
	public void verifyProductTitle() {
		String ProdTitle=ProductTitle.getText();
		System.out.println("Product Name is :"+ProdTitle);
	}
	
	
	
	
}
