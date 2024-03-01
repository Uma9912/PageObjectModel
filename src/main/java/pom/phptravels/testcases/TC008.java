package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.RegisterPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
	testCaseName="TC008";
	testCaseDescription="To verify new user registration for the PhpTravels Application";
	author="Uma";	
	category="Regression";	
	browserName="chrome";
	url="https://www.phptravels.org/register.php";
	sheetName="TC008";
	}
	
	@Test(dataProvider = "fetchData")
	public void phpTravelsRegistration(String firstName, String lastName, String emailId,
			String phoneNumber, String companyName, String address1,String address2,String city,
			String state, String postcode, String inputCountry, String  customField, String password, 
			String password2) {
		
		new RegisterPage()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(emailId)
		.enterPhoneNo(phoneNumber)
		.enterCompanyName(companyName)
		.enterStreetAddress(address1)
		.enterStreetAddress2(address2)
		.enterCity(city)
		.enterState(state)
		.enterPostCode(postcode)
		.selectOnCountry(inputCountry)
		.enterPhoneNumber(customField)
		.enterPassword(password)
		.enterConfirmPassword(password2)
		.clickOnGeneratePassword()
		.clickOnNewGeneratePassword()
		.clickOnCopy()
		.clickOnClipBoard()
		;
	}
}
