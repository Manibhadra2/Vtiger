package com.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericlibrary.BaseTest;
import com.vtiger.genericlibrary.WebDriverUtility;
/**
 * 
 * @author [Rakesh B]
 */
public class HomePage extends BaseTest {
	

	
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
	
	@FindBy(linkText = "Calendar")
	private WebElement Calender;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCalender() {
		return Calender;
	}

	public WebElement getLeads() {
		return Leads;
	}

	public WebElement getOrganization() {
		return Organization;
	}

	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getProducts() {
		return Products;
	}

	public WebElement getDocuments() {
		return Documents;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getTroubleTickets() {
		return TroubleTickets;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getMore() {
		return More;
	}
	
	
	public WebElement getSetting() {
		return Setting;
	}

	public WebElement getQuickcreaElement() {
		return quickcreaElement;
	}

	@FindBy(linkText = "Leads")
	private WebElement Leads;
	
	@FindBy(linkText = "Organizations")
	private WebElement Organization;
	
	@FindBy(linkText = "Contacts")
	private WebElement Contacts;
	
	
	@FindBy(linkText = "Products")
	private WebElement Products;
	
	@FindBy(linkText = "Documents")
	private WebElement Documents;
	
	@FindBy(linkText = "Email")
	private WebElement Email;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement TroubleTickets;
	
	
	@FindBy(linkText = "Dashboard")
	private WebElement Dashboard;
	
	@FindBy(linkText = "More")
	private WebElement More;
	
	@FindBy(id = "qccombo")
	private WebElement quickcreaElement;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/mainSettings.PNG']")
	private WebElement Setting;
	
	
	
	
	
	
	
	
}
