package com.testcases;

import java.io.IOException;
import com.baseclass.Library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.baseclass.Library;
import com.pages.OHRMloginusingPOM;
import com.seleniumutils.SellUtils;

public class OHRMloginusingPOMTestcases extends Library {
	SellUtils   util;
	//= new SellUtils(driver);
	@BeforeClass
   public void startUp() {
		launchApplication("chrome", "https://opensource-demo.orangehrmlive.com");
	}
    @Test
	public void loginpage() {
    	OHRMloginusingPOM HRM = new OHRMloginusingPOM(driver);
    	HRM.login("Admin", "admin123");
    }
    @AfterClass
	public void close() throws IOException {
     util = new SellUtils(driver);
   	util.getTitle();
	util.to_take_screenshot("/src/test/resources/screenshots/orangehrm.png");
	quit();
    }

}
