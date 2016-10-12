package com.saf.functions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions {

	private WebDriver driver;
	public int CLICK_TIMEOUT_SECONDS = 10;

	public WebActions(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement click(WebElement el) throws SeleniumException {
		String tag = el.getTagName();
		try {
			waitUntilClickable(el, CLICK_TIMEOUT_SECONDS);
			// try {
			el.click();
			/*
			 * } catch (Exception e) { Actions actions = new Actions(driver);
			 * actions.moveToElement(el).click().perform(); }
			 */
		} catch (NoSuchElementException e) {
			throw new SeleniumException(
					"WebAction -> click() - Error in click operation on element <%s>: %s" + tag + e.getMessage());
		}
		return el;
	}

	public WebElement waitUntilClickable(final WebElement el, int timeout) {
		int waitSeconds = timeout;
		final String message = "Element never became clickable after '%d' seconds" + waitSeconds;
		WebDriverWait wait = new WebDriverWait(driver, waitSeconds);
		wait.withMessage(message).ignoring(StaleElementReferenceException.class);
		wait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver webDriver) {
				if (isClickable(el)) {
					return el;
				}
				return null;
			}
		});
		return el;
	}

	public boolean isClickable(WebElement el) {
		if (el == null) {
			return false;
		}
		try {
			if (!el.isDisplayed()) {
				return false;
			}
			if (!el.isEnabled()) {
				return false;
			}
			if (el.getSize().getHeight() <= 0 || el.getSize().getWidth() <= 0) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}
    
	public WebElement selectdropdown(WebElement ele,String element){
    	Select sel = new Select(ele);
        sel.selectByVisibleText(element);
    	//sel.selectByIndex(a);
        //sel.selectByValue(option);
    	return ele;
    	
    }

	/*public WebElement selectdropdown2(WebElement ele,String option, WebElement ele2){
		
		List<WebElement> lst=ele;
		for(WebElement i:lst)
        {
            System.out.println(i.getText());
            Select sel = new Select(ele);
            sel.selectByVisibleText(ele2.getText());  
        } 
            // Select a value from the drop down list Selenium WebDriver
		

		
		
	}*/
	
}
