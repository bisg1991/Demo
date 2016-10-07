package com.globchk.pages;

import org.openqa.selenium.WebDriver;

import com.globchk.pageObjects.AdminReadingCenterAddObjects;
import com.saf.functions.CommonFunctionsLib;
import com.saf.functions.SeleniumException;
import com.saf.functions.WebActions;

public class AdminReadingCenterAd extends HomePageAdmin {

	private AdminReadingCenterAddObjects arcd;
	
	public AdminReadingCenterAd(WebDriver driver, WebActions action) {
		super(driver, action);
		arcd = new AdminReadingCenterAddObjects(driver);
	}

    public void addReadingcenteruser() throws SeleniumException{
    	
    	action.click(arcd.linkAdminReadingCenter);
    	CommonFunctionsLib.log("Clicked on the Admin/ReadingCenter dropdown menu");
    	
    	action.click(arcd.linkAddAdminReadingCenter);
    	CommonFunctionsLib.log("Clicked on the Add Admin/readingCenter link");
    	
    	arcd.txtFirstName.sendKeys("Testuser");
    	CommonFunctionsLib.log("First name entered");
    	
    	arcd.txtLastName.sendKeys("demo");
    	CommonFunctionsLib.log("Last name entered");
    }


}
