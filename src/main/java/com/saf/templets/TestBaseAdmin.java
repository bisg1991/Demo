package com.saf.templets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.globchk.pages.LandingPage;
import com.globchk.pages.LandingPageAdmin;
import com.saf.functions.CommonFunctionsLib;
import com.saf.functions.WebActions;

public class TestBaseAdmin {
	private WebDriver driver;
	private WebActions action;
	protected LandingPageAdmin landingPage;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Java\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new MarionetteDriver(capabilities); //for selenium 3 use new
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("http://globechek.softwebopensource.com/admin");
		CommonFunctionsLib.log("Navigate to 'http://globechek.softwebopensource.com/admin'");
		action = new WebActions(driver);
		landingPage = new LandingPageAdmin(driver, action);
	}

	@AfterMethod
	public void destory() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
}
