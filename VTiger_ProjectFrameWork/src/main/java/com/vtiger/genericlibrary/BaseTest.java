package com.vtiger.genericlibrary;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.vtiger.pomrepository.HomePage;
import com.vtiger.pomrepository.LoginPage;
/**
 * 
 * @author [Rakesh B]
 */
public class BaseTest {

	public DataUtility data_Utility = new DataUtility();
	public WebDriverUtility webDriver_Utility = new WebDriverUtility();
	static ExtentSparkReporter sparkReporter;
	static ExtentReports reports ;
	public ExtentTest test;
	public WebDriver driver;
	public static WebDriver listenersDriver;
	public LoginPage login_Page;
	public HomePage home_Page;

	@BeforeSuite
	public void reportSetUp() {
		
		sparkReporter = new ExtentSparkReporter("./Report/"+JavaUtility.getTimeStamp()+".html");
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
	}
	
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchTheBrowser(@Optional("chrome") String browser) throws IOException {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		listenersDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_Utility.getDataFromProperties("url"));
	}

	@BeforeMethod(alwaysRun = true)
	public void performLogin(Method method) throws IOException {
		test=reports.createTest(method.getName());
		login_Page = new LoginPage(driver);
		login_Page.performLogin(data_Utility.getDataFromProperties("username"), data_Utility.getDataFromProperties("pwd"));
		home_Page = new HomePage(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void performLogout() {
		webDriver_Utility.mouseOveronElement(driver, home_Page.getUserAccountImage());
		home_Page.getSignOutLink().click();
	
	}

	@AfterClass(alwaysRun = true)
	public void closeTheBrowser() {
		driver.quit();
		reports.flush();
	}
}
