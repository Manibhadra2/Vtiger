package com.vtiger.testcase.organization;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.vtiger.genericlibrary.BaseTest;

public class VT_Organization001 extends BaseTest{

	@Test
	public void verify_Organization_Page_Is_Displayed() {
		
		home_Page.getOrganizationLink().click();
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("Organization Page Displayed", true);
		test.log(Status.PASS, "Organization Page Displayed");
		test.addScreenCaptureFromPath(webDriver_Utility.captureScreenshot(driver));
	}
}
