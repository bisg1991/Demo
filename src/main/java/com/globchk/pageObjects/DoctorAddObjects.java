package com.globchk.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoctorAddObjects {
	
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
	
	@FindBy(id="exampleInputEmail1")
	public WebElement txtcellno;
	
	@FindBy(name="website")
	public WebElement txtweburl;
	
	@FindBy(xpath="//div[@class='row']/div[1]/label/input[@value='male']")
	public WebElement radiomale;
	
	@FindBy(xpath="//div[@class='row']/div[2]/label/input[@value='female']")
	public WebElement radiofemale;
	
	@FindBy(id="dp1476508942876")
	public WebElement seldob;
	
	@FindBy(name="special")
	public WebElement dropspecial;
	

}
