package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookregister {
	
	WebDriver driver;
	
	By firstname = By.name("firstname");
	By lastname = By.name("lastname");
	By mobileno = By.id("u_0_v");
	By newpassword = By.id("u_0_10");
    By month = By.id("month");
	By day = By.id("day");
	By year = By.id("year");
	
	public Facebookregister(WebDriver driver) {
		this.driver=driver;
	}
	public void fname(String name){
		 driver.findElement(firstname).sendKeys(name);
	}
	
	public void lastname(String surname) {
		 driver.findElement(lastname).sendKeys(surname);
	}
	public void lname(String mobile){
		 driver.findElement(mobileno).sendKeys(mobile);
	}
	public void newpwd(String pass){
		 driver.findElement(newpassword).sendKeys(pass); 
	}
	public void birthday (String mont, int da, String yea) {
		
		//select by visible text
		  Select month = new Select(driver.findElement(By.id("month")));
		  month.selectByVisibleText("Jun");
		  //select by index
		  Select day = new Select(driver.findElement(By.id("day")));
		  day.selectByIndex(10);
		  //select by value
		  Select year = new Select(driver.findElement(By.id("year")));
		  year.selectByValue("2010");
		 
		
	}
	
	
	
	

}
