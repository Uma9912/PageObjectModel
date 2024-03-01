package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify new user registration for the BookYourCoach Irctc Application";
		author="Uma";
		category="Functional";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC002";
	}
	@Test(dataProvider = "fetchData")
	public void bookYourCoach(String userId , String password, String confirmPassword, String sectionQuestion,
			String sectionAnswer , String month ,String year, String email, String occupation,
			String firstName, String middleName, String lastName, String natinality, String flatNo, 
			String street, String area, String country, String mobile, String pincode, String  city,
			String state,String postOffice, String flatNoOffice, String streetOffice, String areaOffice,
			String countryOffice,String mobileOffice , String pincodeOffice, String cityOffice, String stateOffice,
			String postOfficeOffice) {
		
		new HomePage()
		.waitPropertyy(3000)
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToWindow()
		.clickOnSidebarCollapse()
		.clickOnBookYourCoach()
		.switchToWindow()
		.clickOnNewSignUp()
		.enterUserId(userId)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.selectOnSecurityQuestion(sectionQuestion)
		.enterSecurityAnswer(sectionAnswer)
		.clickOnDateOfBirth()
		.selectOnMonth(month)
		.selectOnYear(year)
		.clickOnDate()
		.clickOnGender()
		.clickOnMaritalStatus()
		.enterEmail(email)
		.selectOnOccupation(occupation)
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.selectOnNationality(natinality)
		.enterFlatNo(flatNo)
		.enterStreet(street)
		.enterArea(area)
		.selectOnCountry(country)
		.enterMobileNo(mobile)
		.enterPinCode(pincode)
		.keysPageDown()
		.selectOnCity(city)
		.selectOnState(state)
		.selectOnPostOffice(postOffice)
		.clickOnResidentialAddress()
		.enterOfficeFlatNo(flatNoOffice)
		.enterOfficeStreet(streetOffice)
		.enterOfficeArea(areaOffice)
		.selectOnCountryOffice(countryOffice)
		.enterMobileOffice(mobileOffice)
		.enterOfficePinCode(pincodeOffice)
		.keysPageDown()
		.selectOnCityOffice(cityOffice)
		.selectOnStateOffice(stateOffice)
		.selectOnPostOffice1(postOfficeOffice)
		;
	}

}
