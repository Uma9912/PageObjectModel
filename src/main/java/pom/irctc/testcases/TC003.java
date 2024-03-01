package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify new user registration for the saloonMandatoryCheck Irctc Application";
		author="Uma";
		category="Functional";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC003";
	}
	@Test(dataProvider = "fetchData")
	public void  saloonMandatoryCheck(String name, String organization, String address,
			String mobile, String email,String requestFor, String originStation,String destnStation,
			String durationPeriod, String coachDetails, String numPassenger, String numPassenger1,
			String charterPurpose, String services, String verifyText) {
		
		new HomePage()
		.waitPropertyy(3000)
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToWindow()
		.clickOnSidebarCollapse()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterName(name)
		.enterOrganisation(organization)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmail(email)
		.selectOnOption(requestFor)
		.enterOriginatingStation(originStation)
		.enterDestinationStation(destnStation)
		.clickOnCheckInDate()
		.clickOnDate()
		.clickOnCheckOutDate()
		.clickOnOutDate()
		.enterDurationOfTour(durationPeriod)
		.enterCoachesRequired(coachDetails)
		.enterNumberOfPassengers(numPassenger)
		.enterNumberOfPassengers1(numPassenger1)
		.enterCharterPurpose(charterPurpose)
		.enterServices(services)
		.clickOnSubmit()
		.verifyTextOnMoblie(verifyText)
		;
	}

	

}
