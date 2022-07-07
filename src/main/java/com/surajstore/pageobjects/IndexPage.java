/**
 * 
 */
package com.surajstore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surajstore.base.BaseClass;

/**
 * @author Suraj
 *
 */
public class IndexPage extends BaseClass {

	LoginPage loginpage = new LoginPage(null);

	@FindBy(css = ".login")
	private WebElement logniBtn;

	@FindBy(id = "search_query_top")
	private WebElement search;

	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickSignIn() {
		logniBtn.click();
		return loginpage;
	}

	public String getMyStoreTitle() {
		String myStoreTitel = driver.getTitle();
		return myStoreTitel;

	}
}
