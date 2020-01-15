package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;

public class ResultPage extends TestBase{
	
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
	WebElement result;
	
	@FindBy(xpath="//select[@id='s-result-sort-select']")
	WebElement SortBy;
	
	@FindBy(xpath="//span[@id='productTitle']")
	WebElement Productname;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit;
	
	@FindBy(xpath="//img[starts-with(@alt,'Zappos M4 Plus Bluetooth')]")
	WebElement ItemWatch;
	
	
	public ResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void resultCount() {
		
		String resultC = result.getText();
		System.out.println("Result count for mobile watch is :"+resultC);
		
	}
	
	public void sortByItem() throws InterruptedException {
		
		Select oSelect = new Select (SortBy);
		List<WebElement> Li=oSelect.getOptions();
		System.out.println("Number of item under the drop down is : "+Li.size());
		
		for (int i=0;i < Li.size();i++)
		{
			String LiVal = Li.get(i).getText();
			System.out.println(LiVal);
//			oSelect.selectByVisibleText(LiVal);
//			Thread.sleep(10000);
		}
	}
	
	public String productname() {
		String Pname = Productname.getText();
		return Pname;
	}
	
	public OrderPage SelectedItem() throws InterruptedException {
		ItemWatch.click();
		System.out.println("Item selected and moved to order page");
		//util.switchToWindow();
		/*
		 * ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		 * System.out.println("Size of window is" + handle.size() );
		 * driver.switchTo().window(handle.get(1));
		 */
		
		return new OrderPage();
	}
	
	

}
