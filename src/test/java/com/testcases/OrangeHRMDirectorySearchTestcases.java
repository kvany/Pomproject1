package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.baseclass.Library;
import com.pages.OrangeHRMDirectorySearch;

public class OrangeHRMDirectorySearchTestcases extends Library {

	@BeforeMethod
	public void startup() {
		launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }


	//@Test (priority=1)
	//public void login() {
		//OrangeHRMlogin loginobj = new OrangeHRMlogin(driver);
		//loginobj.username("Admin");
		//loginobj.password("admin123");
		//loginobj.loginbutton();
	//}

	@Test 
	public void login() throws InterruptedException {
		
		OrangeHRMDirectorySearch loginobj = new OrangeHRMDirectorySearch(driver);
		loginobj.username("Admin");
		loginobj.pass("admin123");
		loginobj.login();
		Thread.sleep(3000);
	    loginobj.catagory();
		loginobj.personname("Thomas Fleming");
		loginobj.job("IT Manager");
		loginobj.location("Canada");
		loginobj.search();
		
	}
   // public void search() {
	//	OrangeHRMDirecSearch searchobj = new OrangeHRMDirecSearch();
	//	searchobj.tab();
	//	searchobj.personname("Thomas Fleming");
	//	searchobj.job("IT Manager");
	//	searchobj.location("Canada");
		//searchobj.loginbutton();
	//}

	@AfterMethod
	public void close() throws IOException, InterruptedException {
		screenshot("src/test/resources/screenshots/facebook1.png");
		Thread.sleep(3000);
		quit();

	}
}