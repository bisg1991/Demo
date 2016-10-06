package com.globchk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjectsAdmin {
public String strTitle = "login";
	
	public HomePageObjectsAdmin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
