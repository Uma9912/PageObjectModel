package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import pom.irctc.pages.HotelDetailsPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify new user registration for the BookHotels Irctc Application";
		author="Uma";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC004";
	}
@Test(dataProvider = "fetchData")
	public void bookHotels(String email, String mobileNo, String filterText, String  hotelRoom,
			String hotelAdult, String title, String firstName, String lastName, String country, String state,
			String gst,String otp) {
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToWindow()
		.clickOnSidebarCollapse()
		.clickOnHotels()
		.switchToWindow()
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
		.waitPropertyy(7000)
		.clickOnCheckOutDate()
		.waitPropertyy(5000)
		.clickOutDate()
		.waitPropertyy(3000)
		.clickOnGuest()
		.SelectOnHotelRoom(hotelRoom)
		.SelectOnHotelAdult(hotelAdult)
		.waitPropertyy(3000)
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
		.waitPropertyy(4000)
		.selectOnCountry(country)
		.waitPropertyy(4000)
		.selectOnState(state)
		.selectOnGst(gst)
		.verifyContainsHotelName(HotelDetailsPage.hotelName)
		.verifyContainsHotelPrice(HotelDetailsPage.hotelPrice)
		.keysPageDown()
		.clickOnContinue()
		.waitPropertyy(3000)
		.clickOnAgree()
		.clickOnMakePayment()
		.waitPropertyy(4000)
		.clickOnOtpVerify()
		.verifyTextOtp(otp)
		;
		
	}
}
