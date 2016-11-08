package com.crest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class AddNewWrecksPage {

	@FindBy(id = "name")
	WebElement txtname;

	@FindBy(id = "description")
	WebElement txtdescription;

	@FindBy(id = "condition")
	WebElement txtcondition;

	@FindBy(id = "yearDiscovered")
	WebElement txtyearDiscovered;

	@FindBy(id = "depth")
	WebElement txtdepth;

	@FindBy(id = "latitude")
	WebElement txtlatitude;

	@FindBy(id = "longitude")
	WebElement txtlongitude;

	@FindBy(xpath = "//*[@value='Save']")
	WebElement btnSave;

	WebDriver driver;

	AddNewWrecksPage(WebDriver webdrivercontext) {
		//this.driver = (AppiumDriver<WebElement>) webdrivercontext;
		this.driver = webdrivercontext;
		PageFactory.initElements(webdrivercontext, this);
	}

	public void fillForm(String name,String descr,String condition, String yeardis,String depth,String latitude,String longitude)
	{
		txtname.sendKeys(name);
		txtdescription.sendKeys(descr);
		txtcondition.sendKeys(condition);
		txtyearDiscovered.sendKeys(yeardis);
		txtdepth.sendKeys(depth);
		txtlatitude.sendKeys(latitude);
		txtlongitude.sendKeys(longitude);
	}
	
	public void clickOnSave()
	{
		btnSave.click();
	}
}
