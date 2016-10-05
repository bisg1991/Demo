package com.globalchk.tests;

import org.testng.annotations.Test;

import com.saf.functions.SeleniumException;
import com.saf.templets.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void loginTest() throws SeleniumException {
		landingPage.login("adamkatz@gmail.com", "test123").verifyHomePage();
	}

}
