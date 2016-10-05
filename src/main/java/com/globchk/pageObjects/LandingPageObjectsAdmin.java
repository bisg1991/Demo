package com.globchk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageObjectsAdmin {

        public LandingPageObjectsAdmin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	    }
 
        @FindBy(name="email")
        public WebElement txtemails;
        

        @FindBy(name="password")
        public WebElement txtpasswords;
        
        @FindBy(xpath="//button[@type='submit']")
        public WebElement btnsignin;





}
