package com.seleniumutils;

import java.io.File;
import java.io.IOException;
import com.baseclass.Library;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// all selenium methods will be there in this class

public class SellUtils extends Library{
	WebDriver driver;
	
	//constructor
	public SellUtils(WebDriver driver)

	{
		this.driver = driver;
	}
	// to take screenshot
	public void to_take_screenshot(String path){
		TakesScreenshot ts = (TakesScreenshot) driver;
	File file = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File(path));

		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public void getTitle() {
		String Title = driver.getTitle();
		System.out.println(driver.getTitle());
		
	}
	
	public void Explicitlywait(String Locator) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
	}
	
	public void quit() {
		quit();
	}
	}
	

