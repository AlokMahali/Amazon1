package com.amazon.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.util.TestUtil;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	TestUtil tUtil;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homePage= new HomePage();
		loginPage = new LoginPage();
		tUtil= new TestUtil();
	}
	
//	@Test(priority=1)
//	public void verifyToolTipText() throws InterruptedException {
//		
//		homePage.TooltipContainer();
//		
//	}
	
//	  @Test(priority=1) 
//	  public void navigateLoginPage() throws InterruptedException
//	  {
//	  	  homePage.navigatelogin();
//	  	  
//	  }
	  
	
	@Test(priority=1)
	public void validatehomePageTest() throws InterruptedException {
		
		homePage.validateHomePage();
		homePage.sortByItem();
		homePage.IniItemCount();
		
	}

	@Test(priority=2)
	public void searchItemTest() {
		homePage.searchItem("mobile watch");
	}
	
		
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
