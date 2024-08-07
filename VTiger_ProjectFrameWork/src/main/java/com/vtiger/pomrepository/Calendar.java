package com.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar {
	public Calendar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Day")
	private WebElement day;
	
	
	@FindBy(linkText = "Week")
	private WebElement week;
	
	@FindBy(linkText = "Month")
	private WebElement Month;
	
	@FindBy(linkText = "Year")
	private WebElement year;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/cal_prev_nav.gif']")
	private WebElement previousButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/cal_next_nav.gif']")
	private WebElement nextButton;
	
	@FindBy(xpath = "(//img[@title=\"Settings\"])[2]")
	private WebElement setting;
	
	@FindBy(xpath = "//td[@class='calAddButton']")
	private WebElement addButton;
	
	@FindBy(linkText = "vtiger.com")
	private WebElement vtiger;

}
