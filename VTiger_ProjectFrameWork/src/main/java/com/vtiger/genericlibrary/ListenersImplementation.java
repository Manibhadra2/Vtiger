package com.vtiger.genericlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
/**
 * 
 * @author [Rakesh B]
 */
public class ListenersImplementation implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("--------- || Execution of :" + result.getName() + " || Started---------");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("--------- || Execution of :" + result.getName() + " || Success---------");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("--------- || Execution of :" + result.getName() + " || failed---------");
		TakesScreenshot ts = (TakesScreenshot) BaseTest.listenersDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File("./Screenshot/" + result.getName() + ".png");
		try {
			FileHandler.copy(src, tgt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
