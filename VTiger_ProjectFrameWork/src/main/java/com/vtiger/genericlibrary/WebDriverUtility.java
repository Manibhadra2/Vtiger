package com.vtiger.genericlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author [Rakesh B]
 */

public class WebDriverUtility {

	public String captureScreenshot(WebDriver driver) {
		
		String path = "./Screenshot/" + JavaUtility.getTimeStamp() + ".png";

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File(path);
		try {
			FileHandler.copy(src, tgt);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return "." + path;

	}

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void switchToFrame(WebDriver driver, int indexNum) {
		driver.switchTo().frame(indexNum);
	}

	public void switchToFrame(WebDriver driver, String idorName) {
		driver.switchTo().frame(idorName);

	}

	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);

	}

	public void selectOptionByIndex(WebElement dropdown, int indexNum) {
		Select s = new Select(dropdown);
		s.selectByIndex(indexNum);
	}

	public void selectOptionByValue(WebElement dropdown, String value) {
		Select s = new Select(dropdown);
		s.selectByValue(value);
	}

	public void selectOptionByVisibleText(WebElement dropdown, String visibleText) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}

	public void mouseOveronElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void clickUsingActions(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
	}
	public void doubleClickUsingActions(WebDriver driver,WebElement targetElement) {
		Actions act = new Actions(driver);
		act.doubleClick(targetElement).perform();
	} 

	public void scrollTillElementUsingActions(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	public void jsScrollTillElement(WebDriver driver, boolean value, WebElement target) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + value + ")", target);
	}

}
