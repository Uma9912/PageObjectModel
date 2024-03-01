package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify new user registration for the Facebook Application";
		category="Smoke";
		author="Uma";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC007";
	}

	@Test(dataProvider = "fetchData")
	public void facebookNewAccount(String firstName, String lastName, String emailId, String confrimEmailID,
			String password,String date, String month, String year) {
		
		new Homepage()
		.clickOnCreateAccount()
		.enterFirstName(firstName)
		.enterSurName(lastName)
		.enterEmail(emailId)
		.enterConfirmEmail(confrimEmailID)
		.enterPassword(password)
		.selectOnDay(date)
		.selectOnMonth(month)
		.selectOnYear(year)
		.clickOnGender()
		;
	}
}
