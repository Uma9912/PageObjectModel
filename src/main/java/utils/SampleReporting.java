package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReporting {

  public static ExtentReports report;
	public static ExtentTest test;
	
	public void startReport() {
		 report = new ExtentReports("./reports/Result.html", false);
	}
	public void startTest(String testName, String description) {
		 test = report.startTest(testName, description);
	}
	
	public void reportStep(String details, String status) {
		if (status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details);
		} else if(status.equalsIgnoreCase("fail")) {
		   test.log(LogStatus.FAIL, details);
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.FAIL, details);
		} else if(status.equalsIgnoreCase("warning")) {
			 test.log(LogStatus.WARNING, details);
		}
	}
	
	
	public void endTest() {
		report.endTest(test);
	}
	
	public void endReport() {
		report.flush();
	}
}

