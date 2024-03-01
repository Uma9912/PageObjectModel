package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify new user registration for the BookHotelsGstValidation Irctc Application";
		author="Uma";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC005";
	}
	@Test(dataProvider = "fetchData")
	public void bookHotelsGstValidation(String email, String mobileNo, String filterText, String  hotelRoom, String hotelAdult,
			String title, String firstName, String lastName, String country, String state, String gst,
			String companyName, String companyAddress, String verifyText) {
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToWindow()
		.clickOnSidebarCollapse()
		.clickOnHotels()
		.switchToWindow()
		.waitPropertyy(2000)
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmail(email)
		.enterMobileNumber(mobileNo)
		.clickOnLogin1()
		.waitPropertyy(5000)
		.enterLocation(filterText)
		.waitPropertyy(5000)
		.clickOnLocation()
		.waitPropertyy(5000)
		.clickOnCheckDate()
		.waitPropertyy(5000)
		.clickOnDate()
		.waitPropertyy(6000)
		.clickOnCheckOutDate()
		.waitPropertyy(5000)
		.clickOutDate()
		.clickOnGuest()
		.SelectOnHotelRoom(hotelRoom)
		.SelectOnHotelAdult(hotelAdult)
		.waitPropertyy(5000)
		.clickOnDone()
		.clickOnSearchHotel()
		.clickOnHotel()
		.switchToWindow()
		.getTextOnHotelName()
		.getTextOnHotelPrice()
		.clickOnContinueToBook()
		.clickOnTitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectOnCountry(country)
		.selectOnState(state)
		.selectOnGst(gst)
		.enterCompanyName(companyName)
		.enterCompanyAddress(companyAddress)
        .keysPageDown()
		.clickOnContinueOption()
		.verifyContainsGstNumber(verifyText)
		;
		
	}

}
