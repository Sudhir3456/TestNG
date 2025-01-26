package TestNG4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtenSparkReporter implements ITestListener
{
	public ExtentSparkReporter sparkReporter;   //UI of the report
	public ExtentReports extent;   //populate common info on the report
	public ExtentTest test;    //creating test case entries in the report and update status of the test methods
	
	
	public void onStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("User.dir")+ "/reports/myReport.html"); //specify
		
		sparkReporter.config().setDocumentTitle("Automation Report");   //Title of report
		sparkReporter.config().setReportName("Functional Testing");  //name of the report
		sparkReporter.config().setTheme(Theme.DARK);     //theme of report
		

		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Sudhir Kumar Yadav");
		extent.setSystemInfo("OS", "windows10");
		extent.setSystemInfo("Browser Name", "Chrome");
 
		
	}
    
	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName());  // Create a new entry in the report
		test.log(Status.FAIL, "Test case FAILED is :"+ result.getName());
		test.log(Status.FAIL, "Test case FAILED is Cause is :"+ result.getName());
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Skipped is :"+ result.getName());
		
	}
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
	
	
	
	
}
