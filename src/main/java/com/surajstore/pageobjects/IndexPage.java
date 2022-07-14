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
	private WebElement SignInBtn;

	@FindBy(id = "search_query_top")
	private WebElement search;
	
	@FindBy(css = ".logo.img-responsive")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactUsBtn;

	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickSignIn() {
		SignInBtn.click();
		return loginpage;
	}

	public String getMyStoreTitle() {
		String myStoreTitel = driver.getTitle();
		return myStoreTitel;

	}
}
