package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify new user registration for the IrctcRegister Application";
		author="Uma";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void irctcRegistration( String userName, String userpassword, String confirmUserPwd,String seletionQuestion,
			String firstName , String middleName, String lastName,String year ,String month,
			String country, String emailId, String mobile, String nationality ,String resAddress1,
			String resAddress2, String resAddress3, String resPinCode, String resState, String city,
			String PostOffice,String resPinCode1, String offAddress1, String offAddress2, String offAddress3,
			String offPinCode,String offState, String offCity,String offPostOff, String offPhone) {
		
		new HomePage()
		.waitPropertyy(3000)
		.clickOnRegister()
		.enterUserName(userName)
		.enterPassword(userpassword)
		.enterConfirmPassword(confirmUserPwd)
		.clickOnPreferredLanguage()
		.clickOnEnglish()
		.clickOnSecurityQuestion()
		.clickOnSecurityQuestionOptions()
		.clickOnSecurityAnswer(seletionQuestion)
		.clickOnContinue()
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName) 
		.clickOnSelectOccupation()
		.clickOnProfessional()
		.clickOnDateOfBirth()
		.selectOnYear(year)
		.selectOnMonth(month)
		.clickOnDate()
		.clickOnGender()
		.selectOnCountry(country)
		.enterEmail(emailId)
		.enterMobile(mobile)
		.selectOnNationality(nationality)
		.clickOnContinue1()
		.enterAddress(resAddress1)
		.enterStreetLine(resAddress2)
		.enterArea(resAddress3)
		.enterPinCode(resPinCode)
		.enterState(resState)
		.waitPropertyy(3000)
		.selectOnCity(city)
		.selectOnPostOffice(PostOffice)
		.enterPhone(resPinCode1)
		.clickOnNo()
		.enterOfficeAddress(offAddress1)
		.enterOfficeStreetLine(offAddress2)
		.enterOfficeArea(offAddress3)
		.enterOfficePinCode(offPinCode)
		.enterOfficeState(offState)
		.waitPropertyy(4000)
		.selectOnOfficeCity(offCity)
		.selectOnOfficePostOffice(offPostOff)
		.enterOfficePhone(offPhone)
		;
		
	}
}
