package listenerutil;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import basetest.baseclass;

public class listenerimplclass implements ITestListener, ISuiteListener {
      public ExtentReports report;
     public ExtentTest test;
	@Override
	public void onStart(ISuite suite) {
		
		Date date= new Date();
	String newdate = date.toString().replace(" ", "_").replace(":", "_");
		
	ExtentSparkReporter spark= new ExtentSparkReporter
			("./Advance Report/report"+newdate+".html");
	spark.config().setDocumentTitle("Psause");
	spark.config().setReportName("Demo");
	spark.config().setTheme(Theme.DARK);
	
	//ExtentReports report= new ExtentReports();
	report= new ExtentReports();
        report.attachReporter(spark);
        report.setSystemInfo("Browser", "Edge");
	Reporter.log("report config", true);
	}

	@Override
	public void onFinish(ISuite suite) {
		report.flush();
		Reporter.log("report backup", true);
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		
	String testname = result.getMethod().getMethodName();
	//ExtentTest test = report.createTest(testname);
	test = report.createTest(testname);
	//Reporter.log("=="+testname+" Exe started==", true);
	test.log(Status.INFO,"==="+testname+"Exe started==" );
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		//Reporter.log("=="+testname+" Exe success==", true);
		test.log(Status.PASS,"==="+testname+"===");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		Date date= new Date();
		String newdate = date.toString().replace(" ", "_").replace(":", "_");
		
	
		TakesScreenshot ts = (TakesScreenshot)baseclass.sdriver;
//	File temp = ts.getScreenshotAs(OutputType.FILE);
		
	String temp = ts.getScreenshotAs(OutputType.BASE64);
	
	test.addScreenCaptureFromBase64String(temp);
	/*File perm=new File("./Screenshot/TakeSS_"+newdate+".png");
	try {
		FileHandler.copy(temp, perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		String testname = result.getMethod().getMethodName();
		//Reporter.log("=="+testname+" Exe failed==", true);
		test.log(Status.FAIL,"==="+testname+"Execution FAILURE===");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		//Reporter.log("=="+testname+" Exe skipped==", true);
		test.log(Status.SKIP,"==="+testname+"Execution SKIPPED===");
	}

	
		
	
	
	

}
