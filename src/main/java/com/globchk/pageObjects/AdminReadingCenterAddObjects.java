package com.globchk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminReadingCenterAddObjects {
	
	
	public AdminReadingCenterAddObjects(WebDriver driver){

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a/span[contains(text(),'Admin/')]")
	public WebElement linkAdminReadingCenter;
	
	@FindBy(xpath="//ul[@class='treeview-menu menu-open']/li/a[@href='admin/readingcenter/new']")
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
	
	@FindBy(css="select[name='user_type']")
	public WebElement dropusertype;
	
	@FindBy(xpath="html/body/div[1]/div/div/div[3]/section/div/div/form/div[1]/div[6]/select")
	public WebElement dropvalue;
	
	@FindBy(xpath="//select[@name='user_type']/option[text()='Reading Center']")
	public WebElement dropusertypeval;
	
	@FindBy(name="status")
	public WebElement dropuserstatus;
	
	@FindBy(id="profile_img")
	public WebElement btnprofileimage;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement btnsubmit;
	
	@FindBy(xpath="//div[@class='alert alert-success ng-scope']/strong[text()='User added successfully.']")
	public WebElement messageAdminReaAdd;
	

}
