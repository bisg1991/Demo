package com.globchk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	public String strTitle = "home";
	
	public HomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("Hello Git");
	}
}

