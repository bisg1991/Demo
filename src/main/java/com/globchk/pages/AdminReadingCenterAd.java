package com.globchk.pages;

import org.openqa.selenium.WebDriver;

import com.globchk.pageObjects.AdminReadingCenterAdd;
import com.saf.functions.CommonFunctionsLib;
import com.saf.functions.SeleniumException;
import com.saf.functions.WebActions;

public class AdminReadingCenterAd {

	protected WebDriver driver;
	private AdminReadingCenterAdd arcd;
	protected WebActions action;
	
	public AdminReadingCenterAd(WebDriver driver, WebActions action) {
		this.driver = driver;
		arcd = new AdminReadingCenterAdd(driver);
		this.action = action; 
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
