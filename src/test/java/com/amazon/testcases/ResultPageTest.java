package com.amazon.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.ResultPage;

public class ResultPageTest extends TestBase{
	
	ResultPage resultPage;
	HomePage homePage;
	
	
	public ResultPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homePage= new HomePage();
		resultPage=homePage.searchItem("mobile watch");
	}

	@Test(priority=1)
	public void searchResultTest() {
		
		resultPage.resultCount();
	}
	
	@Test(priority=2)
	public void sortByItemTest() throws InterruptedException {
		resultPage.sortByItem();
	}
	
	@Test(priority=3)
	public void SearchItemTest() throws InterruptedException {
		
		resultPage.SelectedItem();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
