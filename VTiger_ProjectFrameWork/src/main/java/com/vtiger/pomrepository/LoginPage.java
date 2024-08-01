package com.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author [Rakesh B]
 */
public class LoginPage {
	
	/* ------ Locators / Web Elements  ------ */
	
	@FindBy(name = "user_name")
	private WebElement userNameTextField;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	/* ------ Constructor ------ */
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* ------ Getters ------ */
	
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	/* ------ Business Logic ------ */
	
	/**
	 * It is used to Perform login 
	 * 
	 * @param userName
	 * @param password
	 */
	
	public void performLogin(String userName, String password) {
		
		getUserNameTextField().sendKeys(userName);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
		
	}
}
