package com.globchk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientAddObjects {
	
	public PatientAddObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='#']/span[text()='Patients']")
	public WebElement clickpatientmenu;
	
	@FindBy(linkText="Add Patient")
	public WebElement linkaddpatient;
	
	@FindBy(name="first_name")
	public WebElement txtfirstname;
	
	@FindBy(name="last_name")
	public WebElement txtLastname;
	
	@FindBy(id="email")
	public WebElement txtemail;
	
	@FindBy(name="billing_name")
	public WebElement txtbillingname;
	
	@FindBy(id="address1")
	public WebElement txtaddress1;
	
	@FindBy(name="country")
	public WebElement dropcountry;
	
	@FindBy(xpath="//div[@class='form-group']/select[@ng-model='userFormData.state']")
	public WebElement dropstate;
	
	@FindBy(name="city")
	public WebElement txtCity;
	
	@FindBy(name="zipcode")
	public WebElement txtzipcode;
	
	@FindBy(name="password")
	public WebElement txtpassword;
	
	@FindBy(name="confirm_password")
	public WebElement txtconfirmpass;
	
	@FindBy(id="dp1476539603545")
	public WebElement seldob;
	
	@FindBy(xpath="//div[@class='row']/div[1]/input[@value='male']")
	public WebElement radiomale;
	
	@FindBy(xpath="//div[@class='row']/div[2]/input[@value='female']")
	public WebElement radiofemale;
	
	@FindBy(name="status")
	public WebElement dropstatus;
	
	@FindBy(xpath="//div[@class='box-footer']/button[text()='SUBMIT']")
	public WebElement btnsubmit;
	
}
