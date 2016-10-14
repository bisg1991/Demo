package com.globchk.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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

	public void addReadingcenteruser() throws SeleniumException, InterruptedException, IOException, AWTException {

		action.click(arcd.linkAdminReadingCenter);
		CommonFunctionsLib.log("Clicked on the Admin/ReadingCenter dropdown menu");

		action.click(arcd.linkAddAdminReadingCenter);
		CommonFunctionsLib.log("Clicked on the Add Admin/readingCenter link");

		Thread.sleep(3500);

		arcd.txtFirstName.sendKeys("Testuser");
		CommonFunctionsLib.log("First name entered");

		arcd.txtLastName.sendKeys("demo");
		CommonFunctionsLib.log("Last name entered");

		arcd.txtEmail.sendKeys("test321@gmail.com");
		CommonFunctionsLib.log("Email entered");

		arcd.txtPassword.sendKeys("123456");
		CommonFunctionsLib.log("Password entered");

		arcd.txtConfirmPassword.sendKeys("123456");
		CommonFunctionsLib.log("Confirm password entered");

		action.click(arcd.dropusertype);
		action.selectdropdown(arcd.dropusertype, "Admin");
		CommonFunctionsLib.log("User type selected from the dropdown");

		String dropdata = action.getSelectedTextFromDropDown(arcd.dropvalue);

		action.click(arcd.dropuserstatus);
		action.selectdropdown(arcd.dropuserstatus, "Active");
		CommonFunctionsLib.log("User status selected from the dropdown");

		action.click(arcd.btnprofileimage);
		Thread.sleep(1000);
		action.UploadFile("C:\\Users\\Biswajit.Ghosh\\Desktop\\Mukharjee.png");
		CommonFunctionsLib.log("Clicked on the profile image upload button");

		action.click(arcd.btnsubmit);
		CommonFunctionsLib.log("Clicked on the Submit button");

		CommonFunctionsLib.log("The user " + dropdata + " is added successfully");
	}

}
