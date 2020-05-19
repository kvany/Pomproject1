package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Library {

	public WebDriver driver;
public void launchApplication(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		} catch (WebDriverException e) {
			System.out.println("browser could not be lanched");
		}
	}

	public void quit() {

		driver.close();
	}

public void screenshot(String path) throws IOException {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path));
	}
}
