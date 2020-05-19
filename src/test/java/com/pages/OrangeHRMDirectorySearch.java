package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMDirectorySearch {

	WebDriver driver;
	//By username = By.id("txtUsername");
	//By password = By.id("txtPassword");
	//By loginbutton = By.xpath("//*[@id=\"btnLogin\"]");

	public OrangeHRMDirectorySearch(WebDriver driver) // creating public facebook login constructor
	{
		this.driver = driver;
	}
	public OrangeHRMDirectorySearch() {
		// TODO Auto-generated constructor stub
	}
	
	By Username = By.id("txtUsername");
	By xpath = By.xpath("//*[@id=\"txtPassword\"]");
	By login = By.className("button");
	By catagory = By.xpath("//*[@id='menu_directory_viewDirectory']/b");
	By personname = By.className("searchDirectory_emp_name_empName");
	By job = By.name("searchDirectory[job_title]");
	By location = By.id("searchDirectory_location");
	By search = By.xpath("//*[@id=\'u_0_b\']"); 
	
	public void username(String name) {
		driver.findElement(Username).sendKeys(name);
	}
	public void pass(String pass) {
		driver.findElement(xpath).sendKeys(pass);
	}
	public void login() {
		driver.findElement(login).click();
	}

	public void catagory() {
		driver.findElement(catagory).click();
	}
	public void personname(String name) {
		driver.findElement(personname).sendKeys(name);
	}

	public void job(String jobname) {
		driver.findElement(job).sendKeys(jobname);
	}

	public void location(String id) {
		driver.findElement(location).sendKeys(id);
	}

	public void search() {
		driver.findElement(search).click();
	}
}
