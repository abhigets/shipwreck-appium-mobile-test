package com.crest.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	DesiredCapabilities caps=null;
	AppiumDriver<WebElement> driver=null;
	FileInputStream fis;
	Properties prop=new Properties();
	
	public AppiumDriver<WebElement> startAppiumforAndroid() 
	{
		try {
			fis=new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/config.properties"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		caps = new DesiredCapabilities();
		caps.setCapability("appPath", System.getProperty("user.dir")+"/src/main/resources/shipwreck.apk");
		caps.setCapability("appPackage", prop.getProperty("appPackage"));
		caps.setCapability("appActivity", prop.getProperty("appActivity"));
		caps.setCapability("appWaitPackage", prop.getProperty("appWaitPackage"));
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName"));
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName"));
		caps.setCapability(MobileCapabilityType.VERSION, prop.getProperty("version"));
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:"+prop.getProperty("portnumber")+"/wd/hub"), caps);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	

}
