package com.crest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class HomePage {

	@FindBy(how=How.XPATH,xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[1]")
	WebElement homepagetext;
	
	@FindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Button[1]")
	WebElement clickherebtn;
	
	AppiumDriver<WebElement> driver;
	
	HomePage(AppiumDriver<WebElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageDescription()
	{
		if(homepagetext.isDisplayed()){
		    return homepagetext.getText();
		}
		else 
			return "No such element";
	}
	
	
	public void clickOnHereButton()
	{
		clickherebtn.click();
	}
}
