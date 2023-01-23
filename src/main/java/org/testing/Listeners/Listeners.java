package org.testing.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Start " + result.getName());
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success " + result.getName());
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failure " + result.getName());
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case skipped " + result.getName());
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
	}

}
