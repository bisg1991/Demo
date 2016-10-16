package com.globchk.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.globchk.pageObjects.HomePageObjects;
import com.saf.functions.CommonFunctionsLib;
import com.saf.functions.WebActions;

public class HomePage extends LandingPage{

	private HomePageObjects obj;

	public HomePage(WebDriver driver, WebActions action) {
		super(driver, action);
		obj = new HomePageObjects(driver);
	}

	public AdminReadingCenterAd verifyHomePage(){
		
		Assert.assertTrue(driver.getCurrentUrl().contains(obj.strTitle));
		CommonFunctionsLib.log("Verify user is on home page");
		
		return new AdminReadingCenterAd(driver, action);
	}
}
