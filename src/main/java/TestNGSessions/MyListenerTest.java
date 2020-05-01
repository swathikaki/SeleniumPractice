package TestNGSessions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListenerTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test case started --->" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed --->" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed --->" + result.getName());
		System.out.println("taking screenshot");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped --->" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
