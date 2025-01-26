package TestNG4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	 public void onStart(ITestContext context)
	 {
		 System.out.print("Test execution is started.....");
	 }
	 public void onTestStart(ITestResult result)
	 {
		 System.out.print("Test is started.....");

	 }
	 public void onTestSuccess(ITestResult result)
	 {
		 System.out.print("Test is passed.....");

	 }
	 public void onTestFailure(ITestResult result)
	 {
		 System.out.print("Test is failed.....");

	 } 
	 public void onTestSkipped(ITestResult result)
	 {
		 System.out.print("Test is skipped.....");
		 
	 }
	 public void onFinish(ITestResult result)
	 {
		 System.out.print("Test execution is comleted.....");

	 }
	
	
	

}
