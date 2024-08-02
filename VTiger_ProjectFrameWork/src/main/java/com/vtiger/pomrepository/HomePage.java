package com.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericlibrary.WebDriverUtility;
/**
 * 
 * @author [Rakesh B]
 */
public class HomePage {
	
	WebDriver driver;
	
	/* ------ Locators / Web Elements  ------ */

	@FindBy(xpath = "//td[@class='genHeaderSmall']/..//td[2]")
	private WebElement userAccountImage;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	@FindBy(xpath = "//td[@class='tabUnSelected']//a[text()='Organizations']")
	private WebElement organizationLink;
	
	/* ------ Constructor ------ */
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* ------ Getters ------ */
	
	public WebElement getUserAccountImage() {
		return userAccountImage;
	}


	public WebElement getSignOutLink() {
		return signOutLink;
	}


	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	
	/* name convention 
	 * Pom classes name ---> Web Page name
	 * WebELement ---> 
	 * */
	
	
}
