package com.surajstore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void beforeSuit() {
		DOMConfigurator.configure("log4j.xml");
	}

	@BeforeTest
	public void readConfig() {
		try {
			prop = new Properties();

			FileInputStream fs = new FileInputStream(
					System.getProperty("user.dir") + "//configuration//Config.properties");

			prop.load(fs);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void launchApp() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.contains("chrome")) {
			WebDriverManager.chromedriver().browserVersion("102.0.5005.63").setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.titleContains("My Store"));
			
		}
		
	}

}
