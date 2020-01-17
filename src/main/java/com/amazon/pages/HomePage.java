package com.amazon.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;
import com.amazon.util.TestUtil;

public class HomePage extends TestBase {
	
	TestUtil tUtil =new TestUtil() ;
	
	@FindBy(xpath="//span[text()='Sign in'][1]")
	WebElement SignIn;
	
	@FindBy(xpath="//span[text()='Hello. Sign in']")
	WebElement AccountList;
	
	@FindBy(xpath="//a[@aria-label='Amazon']")
	WebElement pagetitle;
	
	@FindBy(xpath="//span[text()='Featured']")
	WebElement SortBY;
	
	@FindBy(xpath="//div[@id='gw-layout']")
	WebElement Items;
	
	@FindBy(xpath="//select[@aria-describedby='searchDropdownDescription']")
	WebElement AllItems;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchItem;
	
	@FindBy(xpath="//input[@type='submit' and @class='nav-input']")
	WebElement Submit;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement IniItemCount;
	
	@FindBy(xpath="//div[@id='nav-al-container']")
	WebElement TooltipContainer;
	
	@FindBy(xpath="//div[@id='nav-al-wishlist']")
	WebElement YourList;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validateHomePage() {
		String actval= pagetitle.getText();
		//String actval1=pagetitle.getAttribute("name");
		System.out.println("actual value" + actval);
		//System.out.println("actual value1" + actval1);
		//return actval;
	}
	
	
	public LoginPage navigatelogin() throws InterruptedException {
		tUtil.sync(AccountList);
		AccountList.click();
//		tUtil.sync(AccountList);
		//SignIn.click();
		//tUtil.moveToElement(SignIn);
		//SignIn.click();
//		Actions action =new Actions(driver);
//		action.clickAndHold().moveToElement(SignIn);
//		action.moveToElement(SignIn).build().perform();
		return new LoginPage();
	}
	
//	public void TooltipItemCount () throws InterruptedException {
//		AccountList.click();
//		Thread.sleep(2000);
//		util.moveToElement(YourList);
//		ArrayList<String> YList = driver.findElement( YourList);
//	}
	
public void sortByItem() throws InterruptedException {
		
		Select oSelect = new Select (AllItems);
		List<WebElement> Li=oSelect.getOptions();
		System.out.println("Number of item under the drop down is : "+Li.size());
		
		for (int i=0;i < Li.size();i++)
		{
			String LiVal = Li.get(i).getText();
			System.out.println(LiVal);
			//oSelect.selectByVisibleText(LiVal);
			//Thread.sleep(1000);
		}
	}
	
public ResultPage searchItem (String ItemName) {
	
	searchItem.sendKeys(ItemName);
	Submit.click();	
	return new ResultPage();
	
}

public void IniItemCount() {
	String Item=IniItemCount.getText();
	System.out.println("Item Count for Initial is : " + Item);
	
}

public void TooltipContainer() throws InterruptedException {
	tUtil.moveToElement(AccountList);
	Thread.sleep(2000);
	String ToolTipText = TooltipContainer.getText();
	System.out.println(ToolTipText);
	
}
	
	

}
