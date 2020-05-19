package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.baseclass.Library;
import com.pages.OrangeHRMloginAdminpages;
import com.seleniumutils.SellUtils;

public class OrangeHRMAdmintestcases extends Library {
	SellUtils   util;
	@BeforeMethod
	public void startup() {
		launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
    }

	@Test
	public void login() {
		
		OrangeHRMloginAdminpages loginobj = new OrangeHRMloginAdminpages(driver);
		loginobj.username("Admin");
		loginobj.password("admin123");
		loginobj.loginbutton();
		loginobj.tab();
		loginobj.user("Hannah Flores");
		loginobj.userrole("SelectByVisibleText('ESS')");
		loginobj.Employeename("Hannah Flores");
		loginobj.status("SelectByVisibleText('Enabled')");

	}

	@AfterMethod
	public void close() throws IOException {
	
		util = new SellUtils(driver);
	   	util.getTitle();
		util.to_take_screenshot("/src/test/resources/screenshots/orangehrm.png");
		quit();
	    }
	}

