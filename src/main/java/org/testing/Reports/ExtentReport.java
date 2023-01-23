package org.testing.Reports;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeClass
	public void setExtent() {
		// specify location of the report
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport.html");

		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Testing");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// Passing General information
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("OS", "Window 10");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Jayant Rai");
		extent.setSystemInfo("Browser", "Firefox");
	}

	@AfterClass
	public void endReport() {
		extent.flush();
	}

	@Test
	public void testpass() {
		driver.get("https://www.youtube.com/watch?v=j4pvu41fdUk");
		System.out.println("Test");
		test = extent.createTest("Successfully Test");
		test.log(Status.PASS, "Test Method Successfull");

	}

	@Test
	public void testfailed() {
		System.out.println("Test");
		test = extent.createTest("Successfully Test");
		test.log(Status.FAIL, "Test Method Failed");
		Assert.fail("Execution  Failed test method");

	}

	@Test
	public void testSkip() {
		System.out.println("Test");
		test = extent.createTest("Successfully Test");
		test.log(Status.SKIP, "Test Method Skip");
		throw new SkipException("Execution Skip Test method");

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {

	}
}
