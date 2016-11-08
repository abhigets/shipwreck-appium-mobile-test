package com.crest.test;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import com.crest.pages.PageObject;

public class AddNewShipWreckTest {
	@Test
	void addNewShipWreckTest() throws IOException
	{
		PageObject po=new PageObject();
		po.homePage().clickOnHereButton();
		po.shipWreckPage().clickOnAddNewShipwreck();
		po.addNewWrecksPage().fillForm("Box", "Box with Sweets", "refrigerated", "2016", "196", "20.593684", "78.962880");
		po.addNewWrecksPage().clickOnSave();
	}
}
