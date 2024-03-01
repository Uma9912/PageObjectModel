package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers{

	public HotelDetailsPage clickOnHotel() {
		clickByXpath(prop.getProperty("HotelListPage.Hotel.Xpath"));
		return new HotelDetailsPage();
	}
	
}
