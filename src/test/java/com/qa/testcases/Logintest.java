package com.qa.testcases;


import java.lang.System.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.Loginpage;
import com.qa.pages.Logoutpage;

public class Logintest extends Baseclass{
	@Test
	public void Login() throws InterruptedException
	{
		Loginpage log=new Loginpage(driver);
		Logoutpage logout= new Logoutpage(driver);
		
		log.Username();
		log.Password();
		log.Loginbtn();
		Thread.sleep(3000);
		
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		System.out.println("we are homepage");
	}
	else
	{
		Assert.assertTrue(false);
		System.out.println("login failed");
	}
		
		logout.logout();
		System.out.println("logiout succussfull");
	}

}
