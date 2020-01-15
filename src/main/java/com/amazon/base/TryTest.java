package com.amazon.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver.exe");
		System.out.println("Connect Gecko Driver");
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	        driver.get("http://google.com"); 

	}

}
