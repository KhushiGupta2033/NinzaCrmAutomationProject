package ninzaCRM.genericUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	
	ExtentReports report;
	ExtentTest test;

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return ITestListener.super.isEnabled();
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test Execeution Started for "+ methodName);
		
//		Intimate extent reports for @Test start
//		To tell class that the execution has started for this particular method
		test=report.createTest(methodName);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test Execeution Passed for "+ methodName);
		
//		Log the status as pass in the extent report
		test.log(Status.PASS,"Test Execeution Passed for "+ methodName);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" Test Execeution Failed");
		
		//capture the exception
		System.out.println(result.getThrowable());
		
//		Log the EXCEPTION in the extent report
		test.log(Status.WARNING,result.getThrowable());
		
		//capture the screenshot
		JavaUtility j = new JavaUtility();
		WebDriverUtility w= new WebDriverUtility();
		
//		ScreenShot -method name+date and time
		String screenshotName= methodName+j.getSystemDate();
		
		try {
//			Only for screen shot
//			w.captureScreenShot(BaseClass.sdriver, screenshotName);
			
//			To attach screenshot to report-- taking reference from the absolute path returned from the SS method
			String path=w.captureScreenShot(BaseClass.sdriver, screenshotName);
			test.addScreenCaptureFromPath(path);
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
//		Log the status as pass in the extent report
		test.log(Status.FAIL,"Test Execeution Failed for "+ methodName);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test Execeution Skippedd for "+ methodName);
		
		//capture the screenshot
				JavaUtility j = new JavaUtility();
				WebDriverUtility w= new WebDriverUtility();
		
String screenshotName= methodName+j.getSystemDate();
		
		try {
//			Only for screen shot
//			w.captureScreenShot(BaseClass.sdriver, screenshotName);
			
//			To attach screenshot to report-- taking reference from the absolute path returned from the SS method
			String path=w.captureScreenShot(BaseClass.sdriver, screenshotName);
			test.addScreenCaptureFromPath(path);
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
//		Log the status as pass in the extent report
		test.log(Status.SKIP,"Test Execeution Skipped for "+ methodName);
		
//		Capture the Exception
		System.out.println(result.getThrowable());
		
//		Log the status warning in the extent report
		test.log(Status.WARNING, result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite Execeution Started");
		
//		Extent Spark Report Configuration
		ExtentSparkReporter esr= new ExtentSparkReporter(".\\ExtentReports\\Extent-Report"+new JavaUtility().getSystemDate()+".html");
		esr.config().setDocumentTitle("Ninza CRM Automation Report");
		esr.config().setTheme(Theme.DARK);
		esr.config().setReportName("Web Automation Execution Report");
		
		//Extent Report
	 report= new ExtentReports();
		report.attachReporter(esr);
		report.setSystemInfo("Base Browser", "Google Chrome");
		report.setSystemInfo("Base platform", "Windows");
		report.setSystemInfo("Base URL", "Abc.ggh");
		report.setSystemInfo("Reporter Name", "Khushi");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite Execeution Finished");
		
//		Report Generation
		report.flush();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
	}

}
