/**
 * 
 */
package com.surajstore.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.surajstore.base.BaseClass;
import com.surajstore.pageobjects.IndexPage;
import com.surajstore.utility.Log;

/**
 * @author Suraj
 *
 */
public class IndexPageTest extends BaseClass {
	
	IndexPage indexPage;

	@BeforeMethod
	public void setup() {
		launchApp();
		
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

	
	@Test
	public void verifyTitle() {
		Log.startTestCase("verifyTitle");
		indexPage=new IndexPage(driver);
		String actTitle=indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Store");
		Log.info("Title verfied success");
		Log.endTestCase("verifyTitle");
		
	}
}
