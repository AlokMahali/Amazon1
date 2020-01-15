package com.amazon.util;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.base.TestBase;

public class TestUtil extends TestBase{
	
	public TestUtil() {
		super();
	}
	
	public void switchToWindow() {
		
		System.out.println("Hello I am here");
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Size of window is" + handle.size() );
		driver.switchTo().window(handle.get(1));
	}
	
	public void moveToElement(WebElement Welement) {
		
		System.out.println("This is move to element");
		Actions action =new Actions(driver);
		action.clickAndHold().moveToElement(Welement);
		action.moveToElement(Welement).build().perform();
	}
	
	public void sync(WebElement Element) {
		System.out.println("This function is for synchronization");
		
		WebDriverWait eWait = new WebDriverWait(driver,30);
		eWait.until(ExpectedConditions.visibilityOf(Element));
		
	}

}
