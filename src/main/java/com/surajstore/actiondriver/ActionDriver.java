package com.surajstore.actiondriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.surajstore.base.BaseClass;

public class ActionDriver extends BaseClass {
	
	
	public static void click(WebDriver driver, WebElement ele ) {
		
		ele.click();		
		
		
	}
	public static void sendkeys(WebElement ele,String text) {
		
        
		ele.isDisplayed();
		ele.clear();
		ele.sendKeys(text);		
		
	}
	
	public static void implicitWait(WebDriver driver, int timeout) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
}