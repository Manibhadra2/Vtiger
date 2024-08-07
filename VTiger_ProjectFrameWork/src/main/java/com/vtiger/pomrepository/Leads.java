package com.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads {
	
	
	public Leads(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 
					 						 						 							 
	

	public WebElement getImportsLeads() {
		return importsLeads;
	}

	public WebElement getDownDeletedButton() {
		return DownDeletedButton;
	}

	public WebElement getMassedit() {
		return massedit;
	}

	public WebElement getSendmail() {
		return sendmail;
	}

	public WebElement getSendsms() {
		return sendsms;
	}

	public WebElement getMr() {
		return Mr;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getTittle() {
		return Tittle;
	}

	public WebElement getLeadsource() {
		return leadsource;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getAnnualrevenue() {
		return annualrevenue;
	}

	public WebElement getNoofemployees() {
		return noofemployees;
	}

	public WebElement getSecondaryemail() {
		return secondaryemail;
	}

	public WebElement getStreet() {
		return Street;
	}

	public WebElement getPostalCode() {
		return PostalCode;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getLead_no() {
		return lead_no;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getFax() {
		return fax;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getLeadstatus() {
		return leadstatus;
	}

	public WebElement getRating() {
		return rating;
	}

	public WebElement getUser() {
		return user;
	}


	@FindBy(partialLinkText = "Create")
	private WebElement create_a_leads;
	
	
	public WebElement getCreate_a_leads() {
		return create_a_leads;
	}




	public void setCreate_a_leads(WebElement create_a_leads) {
		this.create_a_leads = create_a_leads;
	}


	@FindBy(partialLinkText = "Import")
	private WebElement importsLeads;
	
	@FindBy(xpath = "(//input[@value=\"Delete\"])[2]")
	private WebElement DownDeletedButton;
	
	@FindBy(xpath = "(//input[@value='Mass Edit'])[2]")
	private WebElement massedit;
	
	@FindBy(xpath = "(//input[@value='Send Mail'])[2]")
	private WebElement sendmail;
	
	@FindBy(xpath = "(//input[@value='Send SMS'])[2]")
	private WebElement sendsms;
	
	@FindBy(xpath = "//select[@name=\"salutationtype\"]")
	private WebElement Mr;
	
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	private WebElement firstname;
	
	
	@FindBy(xpath = "//input[@name=\"lastname\"]")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name=\"company\"]")
	private WebElement companyname;
	
	
	@FindBy(xpath = "//input[@name=\"designation\"]")
	private WebElement Tittle;
	
	
	@FindBy(xpath = "//select[@name=\"leadsource\"]")
	private WebElement leadsource;
	
	@FindBy(xpath = "//select[@name=\"industry\"]")
	private WebElement industry;
	
	@FindBy(xpath = "//input[@name=\"annualrevenue\"]")
	private WebElement annualrevenue;
	
	@FindBy(xpath = "//input[@name=\"noofemployees\"]")
	private WebElement noofemployees;
	
	
	@FindBy(xpath = "//input[@name=\"secondaryemail\"]")
	private WebElement secondaryemail;
	
	@FindBy(xpath = "//textarea[@name=\"lane\"]")
	private WebElement Street;
	
	@FindBy(xpath = "//input[@name=\"code\"]")
	private WebElement PostalCode;
	
	@FindBy(xpath = "//input[@name=\"country\"]")
	private WebElement Country	;
	
	@FindBy(xpath = "//textarea[@name=\"description\"]")
	private WebElement description;
	
	@FindBy(xpath = "//input[@name=\"lead_no\"]")
	private WebElement lead_no;
	
	@FindBy(xpath = "//input[@name=\"phone\"]")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@name=\"mobile\"]")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@name=\"fax\"]")
	private WebElement fax;
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name=\"website\"]")
	private WebElement website;
	
	@FindBy(xpath = "//select[@name=\"leadstatus\"]")
	private WebElement leadstatus;
	
	@FindBy(xpath = "//select[@name=\"rating\"]")
	private WebElement rating;
	
	@FindBy(xpath = "(//input[@type=\"radio\"])[1]")
    private WebElement user;



	
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
