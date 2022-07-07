/**
 * 
 */
package com.surajstore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Suraj
 *
 */
public class LoginPage {
LoginPage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
@FindBy(id="email") WebElement EmailAddressTextBox;
@FindBy(id="passwd") WebElement PasswordTextBox;
@FindBy(id="SubmitLogin") WebElement Submitbtn;





}
