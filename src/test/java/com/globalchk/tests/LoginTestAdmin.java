package com.globalchk.tests;

import org.testng.annotations.Test;

import com.saf.functions.SeleniumException;
import com.saf.templets.TestBaseAdmin;

public class LoginTestAdmin extends TestBaseAdmin {

		@Test (priority=1)
		public void loginTest() throws SeleniumException {
			add=landingPage.login("admin@admin.com", "admin").verifyHomePage();
			
		}
	
        @Test (priority=2)
        public void addUserAdminReading() throws SeleniumException{
        	add.addReadingcenteruser();
        }
}
