package com.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.util.TestUtil;

public class LoginPageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	TestUtil util;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		homePage= new HomePage();
//		loginPage=homePage.navigatelogin();
		
	}
	
	 @Test (priority=1) 
	 public void loginTest() throws InterruptedException {
		 
		 loginPage= homePage.navigatelogin();
		// Thread.sleep(5000);
		// loginPage.login(Prop.getProperty("userName"), Prop.getProperty("Password"));
	  
	  }
	 
//	@AfterMethod
//	public void teardown() {
//			driver.quit();
//		}

	 
	 
	

}
