package com.amazon.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.OrderPage;
import com.amazon.pages.ResultPage;
import com.amazon.util.TestUtil;

public class OrderPageTest extends TestBase{
	HomePage homePage;
	OrderPage oPage;
	ResultPage resultPage;
	TestUtil util;
	
	public OrderPageTest() {
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
	}
	
	@Test(priority=1)
	public void verifyPriceOfItemTest() {
		oPage.getPrice();
	}
	
	@Test(priority=2)
	public void verifyProductName() {
		oPage.verifyProductTitle();
	}
	
	@Test(priority=3)
	public void verifyTabItemTest() {
		oPage.TabItem();
	}
	
	@Test(priority=4)
	public void addItemTest() {
		oPage.addtocart();
	}
	
	/*
	 * public void orderPageTest() throws InterruptedException {
	 * 
	 * oPage= homePage.searchItem();
	 * 
	 * //oPage.addtocart();
	 * //System.out.println("Successfully navigate to cart page");
	 * 
	 * }
	 */
	
	/*
	 * @Test(priority=3) public void verifytext() { String Product =
	 * oPage.productname(); System.out.println(Product); }
	 */
	
	
	/*  @Test(priority=3) 
	  public void navigateTocartPage() { 
		  util=new TestUtil();
		  util.switchToWindow();*/
	 // oPage.addtocart(); 
	 // System.out.println("Successfully navigate to cart page");
	//  }
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	 
	 
}
