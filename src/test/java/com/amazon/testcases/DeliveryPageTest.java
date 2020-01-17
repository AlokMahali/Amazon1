package com.amazon.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.CartPage;
import com.amazon.pages.DeliveryPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.OrderPage;
import com.amazon.pages.ResultPage;
import com.amazon.util.TestUtil;

public class DeliveryPageTest extends TestBase{
	
	LoginPage lPage;
	HomePage homePage;
	OrderPage oPage;
	ResultPage resultPage;
	CartPage cPage;
	DeliveryPage dPage;
	TestUtil util;
	
	
	public DeliveryPageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setup() throws InterruptedException {
		initialization();
		homePage= new HomePage();
		resultPage=homePage.searchItem("mobile watch");
		oPage=resultPage.SelectedItem();
		util=new TestUtil();
		util.switchToWindow();
		cPage= oPage.addtocart();
		lPage=cPage.proceedtopay();
		dPage=lPage.login(Prop.getProperty("userName"), Prop.getProperty("Password"));
		
	}
	
	@Test(priority=1)
	public void addressVerify() throws InterruptedException {
		dPage.getAddressDetails();
		Thread.sleep(5000);
		dPage.deliverytoAddress();
		
	}

}
