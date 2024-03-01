package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		// start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// Start Test
		ExtentTest test = report.startTest("TC002", "To verify IRCTC Registration for the new user sign up");
		
		test.assignAuthor("Uma");
		
		test.assignCategory("Functional");
		
		// log steps
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "The application got laucneh with the given url successfully");
		test.log(LogStatus.PASS, "Th  e application got laucneh with the given url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
	}

}
