package com.globalchk.tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.saf.functions.SeleniumException;
import com.saf.templets.TestBaseAdmin;

public class LoginTestAdmin extends TestBaseAdmin {

	@Parameters({ "username", "password" })
	@Test(priority = 1)
	public void loginTest(String username, String password) throws SeleniumException {
		//add = landingPage.login(username, password);
        patientadd=landingPage.logins(username, password);
	}

	@Test(priority = 2)
	public void addUserAdminReading() throws SeleniumException, InterruptedException, IOException, AWTException {
		/*patientadd = add.addReadingcenteruser();
		Thread.sleep(3000);*/
		patientadd.addpatientfull();
	}
}
