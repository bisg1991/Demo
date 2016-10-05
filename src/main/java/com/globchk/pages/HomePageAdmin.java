package com.globchk.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.globchk.pageObjects.HomePageObjects;
import com.globchk.pageObjects.HomePageObjectsAdmin;
import com.saf.functions.CommonFunctionsLib;
import com.saf.functions.WebActions;

public class HomePageAdmin extends LandingPageAdmin {

	private HomePageObjectsAdmin objs;
	
	//Constructor of the class
	public HomePageAdmin(WebDriver driver, WebActions action) {
		super(driver, action);
		objs = new HomePageObjectsAdmin(driver);
	}
    
	//Method of the home page class
	public HomePage verifyHomePage(){
		
		Assert.assertTrue(driver.getCurrentUrl().contains(objs.strTitle));
		CommonFunctionsLib.log("Verify user is on home page");
		
		return new HomePage(driver, action);
	}
}
