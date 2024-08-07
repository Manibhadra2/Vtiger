package com.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	public Contact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Contacts")
	private WebElement ContactButn;
	
	public WebElement getContactButn() {
		return ContactButn;
	}

	
	public WebElement getMport_Contacts() {
		return mport_Contacts;
	}

	public WebElement getBelow_delete_Button() {
		return Below_delete_Button;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getOrganisationname() {
		return organisationname;
	}

	public WebElement getLeadsource() {
		return leadsource;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAssistant() {
		return assistant;
	}

	public WebElement getAssistantphone() {
		return assistantphone;
	}

	public WebElement getEmailoptout() {
		return emailoptout;
	}

	public WebElement getReference() {
		return reference;
	}

	public WebElement getNotify_owner() {
		return Notify_owner;
	}

	public WebElement getPortal_user() {
		return portal_user;
	}

	public WebElement getMailingstreet() {
		return mailingstreet;
	}

	public WebElement getMailingpobox() {
		return mailingpobox;
	}

	public WebElement getMailingcity() {
		return mailingcity;
	}

	public WebElement getMailingstate() {
		return mailingstate;
	}

	public WebElement getMailing_Postal_Code() {
		return Mailing_Postal_Code;
	}

	public WebElement getMailingcountry() {
		return mailingcountry;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getContact_no() {
		return contact_no;
	}

	public WebElement getOffi_phone() {
		return Offi_phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getHomephone() {
		return homephone;
	}

	public WebElement getOtherphone() {
		return otherphone;
	}

	public WebElement getFax() {
		return fax;
	}

	public WebElement getBirthday() {
		return birthday;
	}

	public WebElement getReports_To() {
		return Reports_To;
	}

	public WebElement getSecondaryemail() {
		return secondaryemail;
	}

	public WebElement getDonotcall() {
		return donotcall;
	}

	public WebElement getAssignedto() {
		return assignedto;
	}

	public WebElement getOtherstreet() {
		return otherstreet;
	}

	public WebElement getOtherpobox() {
		return otherpobox;
	}

	public WebElement getOthercity() {
		return othercity;
	}

	public WebElement getOtherstate() {
		return otherstate;
	}

	public WebElement getOther_Postal_Code() {
		return Other_Postal_Code;
	}

	public WebElement getOthercountry() {
		return othercountry;
	}

	public WebElement getDescription1() {
		return description1;
	}

	public WebElement getSave() {
		return save;
	}
	
	
	@FindBy(partialLinkText = "Import Contacts")
	private WebElement mport_Contacts;
	
	@FindBy(xpath = "(//input[@value='Delete'])[2]")
	private WebElement Below_delete_Button;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement organisationname;
	
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadsource;
	
	@FindBy(xpath = "//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@name='department']")
	private WebElement department;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='assistant']")
	private WebElement assistant;
	
	@FindBy(xpath = "//input[@name='assistantphone']")
	private WebElement assistantphone;
	
	@FindBy(xpath = "//input[@name='emailoptout']")
	private WebElement emailoptout;
	
	@FindBy(xpath = "//input[@name='reference']")
	private WebElement reference;
	
	@FindBy(xpath = "//input[@name='notify_owner']")
	private WebElement Notify_owner;
	
	@FindBy(xpath = "//input[@name='portal']")
	private WebElement portal_user;
	
	@FindBy(xpath = "//textarea[@name='mailingstreet']")
	private WebElement mailingstreet;
	
	@FindBy(xpath = "//input[@name='mailingpobox']")
	private WebElement mailingpobox;
	
	@FindBy(xpath = "//input[@name='mailingcity']")
	private WebElement mailingcity;
	
	@FindBy(xpath = "//input[@name='mailingstate']")
	private WebElement mailingstate;
	
	@FindBy(xpath = "//input[@name='mailingzip']")
	private WebElement Mailing_Postal_Code;
	
	@FindBy(xpath = "//input[@name='mailingcountry']")
	private WebElement mailingcountry;
	
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement description;
	
	@FindBy(xpath = "//input[@name='contact_no']")
	private WebElement contact_no;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement Offi_phone;
	
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@name='homephone']")
	private WebElement homephone;
	
	@FindBy(xpath = "//input[@name='otherphone']")
	private WebElement otherphone;
	
	@FindBy(xpath = "//input[@name='fax']")
	private WebElement fax;
	
	@FindBy(xpath = "//input[@name='birthday']")
	private WebElement birthday;
	
	@FindBy(xpath = "//input[@name='contact_name']")
	private WebElement Reports_To;
	
	@FindBy(xpath = "//input[@name='secondaryemail']")
	private WebElement secondaryemail;
	
	@FindBy(xpath = "//input[@name='donotcall']")
	private WebElement donotcall;
	
	@FindBy(xpath = "//select[@name='assigned_user_id']")
	private WebElement assignedto;
	
	@FindBy(xpath = "//textarea[@name='otherstreet']")
	private WebElement otherstreet;
	
	@FindBy(xpath = "//input[@name='otherpobox']")
	private WebElement otherpobox;
	
	@FindBy(xpath = "//input[@name='othercity']")
	private WebElement othercity;
	
	@FindBy(xpath = "//input[@name='otherstate']")
	private WebElement otherstate;
	
	@FindBy(xpath = "//input[@name='otherzip']")
	private WebElement Other_Postal_Code;
	
	@FindBy(xpath = "//input[@name='othercountry']")
	private WebElement othercountry;
	
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement description1;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement save;
	
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement salutationtype;
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createContact;
	
	@FindBy(xpath = "//img[@id='jscal_trigger_support_end_date']")
	private WebElement SupportEnddate;
	
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement Choose_file;

	public WebElement getChoose_file() {
		return Choose_file;
	}


	public WebElement getSupportEnddate() {
		return SupportEnddate;
	}


	public WebElement getCreateContact() {
		return createContact;
	}

	public WebElement getSalutationtype() {
		return salutationtype;
	}

}
