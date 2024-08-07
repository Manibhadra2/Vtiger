package com.vtiger.testcase.organization;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;
import com.vtiger.genericlibrary.BaseTest;
import com.vtiger.genericlibrary.WebDriverUtility;
import com.vtiger.pomrepository.Contact;
import com.vtiger.pomrepository.Leads;


  public class VT_Contact_001 extends BaseTest  {
	  
	  
     @Test
	public void Verify_User_is_able_to_create_contact_to_the_application() throws InterruptedException {
    	 home_Page.getContacts().click();
    	 org.testng.Assert.assertEquals(driver.getTitle(), "Contacts");
    	 Reporter.log("Leads page is displayed",true);
    	 test.addScreenCaptureFromPath(webDriver_Utility.captureScreenshot(driver));
    	 
    	 Thread.sleep(2000);   	  
    //click on create contact	 
    Contact c=new Contact(driver);
    c.getCreateContact().click();
    WebElement firstname = c.getFirstname();
     firstname.click();
     firstname.sendKeys("mani");

	}
   
}
	
	
	
