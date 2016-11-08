package com.crest.test;

import org.testng.annotations.Test;

import com.crest.pages.PageObject;
import com.crest.utility.Base;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class HomePageTest extends Base {
  @Test
  public void verifyHomePageDescription() throws IOException {
	  PageObject po=new PageObject();
	  po.homePage().clickOnHereButton();
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  	  
  }

  @AfterTest
  public void afterTest() {
  }

}
