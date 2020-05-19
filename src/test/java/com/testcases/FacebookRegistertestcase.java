package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.Facebookregister;

public class FacebookRegistertestcase extends Library{
	
	@BeforeClass
	
	public void startup() {
		launchApplication("chrome","https://facebook.com");
	}
	@Test
	public void signup() {
		
		Facebookregister regpage = new Facebookregister(driver);
		regpage.fname("abcd1");
		regpage.lastname("abcd2");
		regpage.lname("12345");
		regpage.newpwd("ajhg");
		regpage.birthday("Jun",10,"2010");
		
	}
	
	@AfterClass
	
	public void close() throws IOException {
		screenshot("src/test/resources/screenshots/facebookreg.png");
		driver.close();
	}
	

}
