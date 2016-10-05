package com.globchk.pages;

import org.openqa.selenium.WebDriver;

import com.globchk.pageObjects.LandingPageObjects;
import com.saf.functions.CommonFunctionsLib;
import com.saf.functions.SeleniumException;
import com.saf.functions.WebActions;

public class LandingPage {

	protected WebDriver driver;
	private LandingPageObjects obj;
	protected WebActions action;

	public LandingPage(WebDriver driver, WebActions action) {
		this.driver = driver;
		obj = new LandingPageObjects(driver);
		this.action = action; 
	}
	
	
	public HomePage login(String userName, String password) throws SeleniumException{
		
		action.click(obj.linkPatientLogin);
		CommonFunctionsLib.log("Clicked on the patient link");
		
		obj.txtEmail.sendKeys(userName);
		CommonFunctionsLib.log("Enter Email text: '" + userName + "'");
		
		obj.txtPassword.sendKeys(password);
		CommonFunctionsLib.log("Enter Password text: '" + password + "'");
		
		action.click(obj.btnSubmit);
		CommonFunctionsLib.log("Enter Email text: '" + userName + "'");
		
		return new HomePage(driver, action);
	}
}
