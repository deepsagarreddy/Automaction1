package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver driver;
	//page factory constructor
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="uid")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement LoginBtn;
	
	@FindBy(name="btnReset")
	WebElement Resetbtn;
	
	//Actions
	
	
	public void Username()
	{
		Username.sendKeys("mngr309191");
	}
	public void Password()
	{
		password.sendKeys("rUmejev");
	}
	public void Loginbtn()
	{
		LoginBtn.click();
	}
	public void Resetbtn()
	{
		Resetbtn.click();
	}
}
