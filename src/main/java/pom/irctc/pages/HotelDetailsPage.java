package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers {
	public static String hotelName = null;
	public static String hotelPrice = null;
	
	public HotelDetailsPage getTextOnHotelName() {
   hotelName = getTextByXpath(prop.getProperty("HotelDetailsPage.HotelName.Xpath"));
		return this;
	}
	public HotelDetailsPage getTextOnHotelPrice() {
	hotelPrice = getTextByXpath(prop.getProperty("HotelDetailsPage.HotelPrice.Xpath"));
		return this;
	}
	public HotelPersonalDetailsPage clickOnContinueToBook() {
		clickByXpath(prop.getProperty("HotelDetailsPage.ContinueToBook.Xpath"));
		return new HotelPersonalDetailsPage();
	}
	public HotelDetailsPage switchToWindow()  {
		switchToLastWindow();
		return this;
	}
}

