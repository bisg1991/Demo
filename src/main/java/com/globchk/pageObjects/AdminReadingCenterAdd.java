package com.globchk.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminReadingCenterAdd {
	
	@FindBy(xpath="//a/span[contains(text(),'Admin/')]")
	public WebElement linkAdminReadingCenter;
	
	@FindBy(linkText="Add Admin/Reading Center")
	public WebElement linkAddAdminReadingCenter;
	
	@FindBy(id="first_name")
	public WebElement txtFirstName;
	
	@FindBy(id="last_name")
	public WebElement txtLastName;
	
	@FindBy(id="email")
	public WebElement txtEmail;
	
	@FindBy(id="password")
	public WebElement txtPassword;
	
	@FindBy(id="confirm_password")
	public WebElement txtConfirmPassword;
	

}
