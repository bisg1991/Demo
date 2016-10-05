package com.globchk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageObjects {

	public LandingPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/login']")
	public WebElement linkPatientLogin;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement txtEmail;
	
	@FindBy(name="password")
	public WebElement txtPassword;
	
	@FindBy(css="button.blue-button")
	public WebElement btnSubmit;
}
