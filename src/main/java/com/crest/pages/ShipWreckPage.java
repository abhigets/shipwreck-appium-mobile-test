package com.crest.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ShipWreckPage {

	@FindBy(xpath = "//*[@content-desc='Add New Shipwreck']")
	WebElement btnAddNewShipwreck;

	AppiumDriver<WebElement> driver;

	ShipWreckPage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddNewShipwreck() {
		
		btnAddNewShipwreck.click();
		contextSwitch();
	}
	
	public void contextSwitch()
	{
		Set<String> handles=driver.getContextHandles();
		Iterator<String>itr=handles.iterator();
		String nativecon=itr.next();
		String webcon=itr.next();
		System.setProperty("webdriver.chrome.driver", "/Users/apn6125/Downloads/chromedriver-1");
		System.out.println(nativecon);
		System.out.println(webcon);
		PageObject.webdrivercontext=driver.context(webcon);
		System.out.println("Context Switched Native to Web");
	}

}
