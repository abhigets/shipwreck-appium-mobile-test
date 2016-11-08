package com.crest.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crest.utility.Base;

import io.appium.java_client.AppiumDriver;

public class PageObject extends Base {

	AppiumDriver<WebElement> driver;
	HomePage homepage;
	ShipWreckPage shipWreckPage;
	AddNewWrecksPage addNewWrecksPage;
	public static WebDriver webdrivercontext;

	public PageObject() throws IOException {
		driver = startAppiumforAndroid();
	}

	public HomePage homePage() {
		if (null == homepage)
			homepage = new HomePage(driver);
		return homepage;
	}
	
	public ShipWreckPage shipWreckPage() {
		if (null == shipWreckPage)
			shipWreckPage = new ShipWreckPage(driver);
		return shipWreckPage;
	}
	
	public AddNewWrecksPage addNewWrecksPage() {
		if (null == addNewWrecksPage)
			addNewWrecksPage = new AddNewWrecksPage(webdrivercontext);
		return addNewWrecksPage;
	}
}
