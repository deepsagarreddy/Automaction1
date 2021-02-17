package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		String Browsername = "chrome";
		if (Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (Browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://selenium//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterClass
	public void close() {
		driver.quit();
	}

}
