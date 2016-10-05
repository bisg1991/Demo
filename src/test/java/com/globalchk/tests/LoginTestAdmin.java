package com.globalchk.tests;

import org.testng.annotations.Test;

import com.globchk.pages.LandingPageAdmin;
import com.saf.functions.SeleniumException;
import com.saf.templets.TestBase;
import com.saf.templets.TestBaseAdmin;

public class LoginTestAdmin extends TestBaseAdmin {

	

		@Test
		public void loginTest() throws SeleniumException {
			landingPage.login("admin@admin.com", "admin").verifyHomePage();
		}
	}
