package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.Facebooklogin;

public class Facebooklogintestcase extends Library {
	
	@BeforeMethod
	public void startup() {
		launchApplication("chrome", "https://facebook.com");
		
	}
	@Test
	public void login()
	{
		Facebooklogin lpage = new Facebooklogin(driver);
		lpage.loginToApp_username("franky22j@gmail.com");
		lpage.loginToApp_password("abcd");
		lpage.loginToApp_loginbutton();
		
	}
	@AfterMethod
	public void close() throws IOException, InterruptedException {
		screenshot("src/test/resources/screenshots/facebook1.png"); 
		Thread.sleep(3000);
		quit();
	}

}
