package com.vtiger.testcase.organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.vtiger.genericlibrary.BaseTest;
import com.vtiger.genericlibrary.WebDriverUtility;
import com.vtiger.pomrepository.Contact;
import com.vtiger.pomrepository.HomePage;
import com.vtiger.pomrepository.Leads;

public class VT_Contact_002 extends BaseTest{
	
	@Test
	public void verify_User_ableto_EditTheContact() {
		home_Page.getContacts().click();
		
		Contact c=new Contact(driver);
		c.getCreateContact().click();
//		Assert.assertEquals(driver.getTitle(), "Creating New Contact");
//		Reporter.log("Creating New Contact is Displayed", true);
//		test.log(Status.PASS, "Organization Page Displayed");
//		test.addScreenCaptureFromPath(webDriver_Utility.captureScreenshot(driver));
		
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		c.getSalutationtype().click();
		
		//click on create new contact
		
//		WebElement salutation = driver.findElement(By.xpath("//select[@name='salutationtype']"));
		
		c.getSalutationtype().click();
       webDriver_Utility.selectOptionByIndex(c.getSalutationtype(), 1);	
		
		
		c.getFirstname().sendKeys("mani");
		c.getLastname().sendKeys("behera");
		c.getLeadsource().click();
		webDriver_Utility.selectOptionByIndex(c.getLeadsource(), 2);
		
		
		c.getTitle().sendKeys("robowaves");
		c.getDepartment().sendKeys("QA");
		
		c.getEmail().sendKeys("mani@gmail.com");
		
		c.getAssistant().sendKeys("jivan");
		
		c.getAssistantphone().sendKeys("987987876");
		
		c.getEmailoptout().click();
		
		c.getReference().click();
		
		c.getNotify_owner().click();
		
		c.getPortal_user().click();
		
		
		c.getSupportEnddate().click();
		
		for(;;) {
			try {
				
				driver.findElement(By.xpath("(//td[@class='selected day'])[5]"));
				
			} catch (Exception e) {
				driver.findElement(By.xpath("(//td[@class='button nav'])[15]")).click();
			}
			
			
			c.getMailingcity().sendKeys("katrigupe");
			
			c.getMailingstate().sendKeys("karnataka");
			
			c.getMailing_Postal_Code().sendKeys("898789");
			
			c.getMailingcountry().sendKeys("india");
			
			c.getDescription().sendKeys("its is huge amount");
			
			
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\manib\\OneDrive\\Desktop\\120-personal-resume.docx");
		}	
		
	}
	
	

}



































