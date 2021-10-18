package testNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener   

{
	

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Testcase start and details are"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		System.out.println("Testcase Success and details are"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcase Failure and details are"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Testcase Skipped and details are"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

	
	
	
}
