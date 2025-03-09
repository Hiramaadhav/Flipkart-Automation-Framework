package com.Project.TestCases;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Base_Class {

	protected static WebDriver driver;
	public static Logger logger;
	public static ExtentReports extent;
	public static ExtentTest test;

	//  Launch browser before tests
	@BeforeClass
	public void setup() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
		}
		logger=LogManager.getLogger("Project");

		// Initialize Extent Reports
		String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Reports/ExtentReport_" + timestamp + ".html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		// Create a test entry
		test = extent.createTest("Flipkart Automation Test");
		test.info("Test Execution Started");
	}

	//  Close browser after tests
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		if (extent != null) {
			test.info("Test Execution Completed");
			extent.flush();
			logger.info("Extent Report generated");
		}
	}
}

