package com.amazon.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.CartPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.OrderPage;
import com.amazon.pages.ResultPage;
import com.amazon.util.TestUtil;

public class CartPageTest extends TestBase{
	
	HomePage homePage;
	OrderPage oPage;
	ResultPage resultPage;
	CartPage cPage;
	TestUtil util;
	
	public CartPageTest() {
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
		
	}
	
	@Test(priority=1)
	
	public void verifyAddCart() {
		cPage.proceedtopay();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	 
	

}
