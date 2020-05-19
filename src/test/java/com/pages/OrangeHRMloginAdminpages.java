package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMloginAdminpages {

	WebDriver driver;
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginbutton = By.xpath("//*[@id=\"btnLogin\"]");
	By tab = By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
	By user = By.id("searchSystemUser_userName");
	By userrole = By.id("searchSystemUser_userType");
	By Employeename = By.id("searchSystemUser_employeeName_empName");
	By status = By.id("searchSystemUser_status");

	public OrangeHRMloginAdminpages(WebDriver driver) // creating public facebook login constructor
	{
		this.driver = driver;
	}

	public void username(String userid) {
		driver.findElement(username).sendKeys(userid);
	}

	public void password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void loginbutton() {
		driver.findElement(loginbutton).click();
	}

	public void tab() {
		driver.findElement(tab).click();
	}

	public void user(String usernm) {
		driver.findElement(user).sendKeys(usernm);
	}

	public void userrole(String role) {
		driver.findElement(userrole).sendKeys(role);
	}

	public void Employeename(String employee) {
		driver.findElement(Employeename).sendKeys(employee);
	}

	public void status(String sts) {
		driver.findElement(status).sendKeys(sts);
	}
}