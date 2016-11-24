package com.globchk.pages;

import org.openqa.selenium.WebDriver;

import com.globchk.pageObjects.LandingPageObjects;
import com.globchk.pageObjects.LandingPageObjectsAdmin;
import com.saf.functions.CommonFunctionsLib;
import com.saf.functions.SeleniumException;
import com.saf.functions.WebActions;

public class LandingPageAdmin {

	protected WebDriver driver;
	private LandingPageObjectsAdmin objs;
	protected WebActions action;

	public LandingPageAdmin(WebDriver driver, WebActions action) {
		this.driver = driver;
		objs = new LandingPageObjectsAdmin(driver);
		this.action = action; 
	}
    public AdminReadingCenterAd login(String username, String password) throws SeleniumException{
    	
    	objs.txtemails.sendKeys(username);
    	CommonFunctionsLib.log("Enter Email text: '" + username + "'");
    	
    	objs.txtpasswords.sendKeys(password);
    	CommonFunctionsLib.log("Enter Password text: '" + password + "'");
    	
    	action.click(objs.btnsignin);
    	CommonFunctionsLib.log("Clicked on the signin button");
		
    	return new AdminReadingCenterAd(driver, action);
    }

    public PatientAdd logins(String username, String password) throws SeleniumException{
    	
    	objs.txtemails.sendKeys(username);
    	CommonFunctionsLib.log("Enter Email text: '" + username + "'");
    	
    	objs.txtpasswords.sendKeys(password);
    	CommonFunctionsLib.log("Enter Password text: '" + password + "'");
    	
    	action.click(objs.btnsignin);
    	CommonFunctionsLib.log("Clicked on the signin button");
		
    	return new PatientAdd(driver, action);
    }

}
