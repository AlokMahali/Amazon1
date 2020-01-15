package com.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties Prop;
	
	public TestBase() {
		
		try {
			Prop= new Properties();
			System.out.print("Pass");
			FileInputStream ip = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Amazon\\src\\main\\java\\com\\amazon\\config\\config.properties");
			Prop.load(ip);
		
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String BrowserName = Prop.getProperty("Browser");
		System.out.println(BrowserName);
		
		if(BrowserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Cucumber SetUp\\resources-driver\\geckodriver.exe");
			System.out.println("Connect Gecko Driver");
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(Prop.getProperty("url"));
		}
		
		else if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Cucumber SetUp\\resources-driver\\ChromeDriver\\chromedriver_79_win32\\chromedriver.exe");
			System.out.println("Connect Chrome Driver");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(Prop.getProperty("url"));
		}
	}

}
