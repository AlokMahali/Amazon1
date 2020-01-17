package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;
import com.amazon.util.TestUtil;

public class LoginPage extends TestBase{
	TestUtil tUtil=new TestUtil();
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement contiune;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signIn;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	public DeliveryPage login(String Email, String Pwd) throws InterruptedException {
		tUtil.sync(email);
		email.sendKeys(Email);
		tUtil.sync(contiune);
		contiune.click();
		tUtil.sync(password);
		password.sendKeys(Pwd);
		tUtil.sync(signIn);
		signIn.click();
		return new DeliveryPage();
	}
	

}
