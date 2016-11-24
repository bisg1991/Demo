package com.globchk.pages;

import org.openqa.selenium.WebDriver;

import com.globchk.pageObjects.AdminReadingCenterAddObjects;
import com.globchk.pageObjects.PatientAddObjects;
import com.saf.functions.CommonFunctionsLib;
import com.saf.functions.SeleniumException;
import com.saf.functions.WebActions;

public class PatientAdd extends HomePageAdmin {
	
	private PatientAddObjects pao;

	public PatientAdd(WebDriver driver, WebActions action) {
		super(driver, action);
		pao = new PatientAddObjects(driver);
	}

	public void addpatientfull() throws SeleniumException{
		
		action.click(pao.clickpatientmenu);
		CommonFunctionsLib.log("Clicked on the patients main menu");
		
		action.click(pao.linkaddpatient);
		CommonFunctionsLib.log("Clicked on the Add Patient link");
		
		action.click(pao.txtfirstname).sendKeys("Robert");
		CommonFunctionsLib.log("First name entered");
		
		action.click(pao.txtLastname).sendKeys("Thomas");
		CommonFunctionsLib.log("Last name entered");
		
		action.click(pao.txtemail).sendKeys("robert@gmail.com");
		CommonFunctionsLib.log("Email address entered");
		
		action.click(pao.txtbillingname).sendKeys("Robert T");
		CommonFunctionsLib.log("Billing name entered");
		
		action.click(pao.txtaddress1).sendKeys("Auda Garden,Bodakdev,Ahmedabad");
		CommonFunctionsLib.log("Address details entered");
		
		action.selectdropdown(pao.dropcountry, "United States");
		CommonFunctionsLib.log("Country selected");
		
		action.selectdropdown(pao.dropstate, "Alabama");
		CommonFunctionsLib.log("State selected");
		
		action.click(pao.txtzipcode).sendKeys("38001");
		CommonFunctionsLib.log("Zipcode entered");
		
		action.click(pao.txtpassword).sendKeys("123456");
		CommonFunctionsLib.log("Password has been entered");
		
		action.click(pao.txtconfirmpass).sendKeys("123456");
		CommonFunctionsLib.log("Confirm password has been entered");
		
		action.click(pao.radiomale).click();
		CommonFunctionsLib.log("Gender has been selected");
		
		action.click(pao.seldob).click();
		action.selectdropdown(pao.dropmonth,"Feb" );
		action.selectdropdown(pao.dropyear, "1991");
		action.click(pao.date);
		CommonFunctionsLib.log("Date of birth selected from the calendar");
	}
	
}
