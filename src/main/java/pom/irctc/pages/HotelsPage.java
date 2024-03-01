package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers {
	
	public HotelsPage  waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	
	public HotelsPage enterLocation(String data) {
		enterByXpath(prop.getProperty("HotelsPage.Location.Xpath"), data);
		return this;
	}
	public HotelsPage clickOnLocation() {
		clickByXpath(prop.getProperty("HotelsPage.Location1.Xpath"));
		return this;
	}
	public HotelsPage clickOnCheckDate() {
		clickByXpath(prop.getProperty("HotelsPage.CheckDate.Xpath"));
		return this;
	}
	
	public HotelsPage clickOnDate(){
		clickByXpath(prop.getProperty("HotelsPage.Date.Xpath"));
		return this;
	}
	public HotelsPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("HotelsPage.CheckOutDate.Xpath"));
		return this;
	}
	public HotelsPage clickOutDate(){
		clickByXpath(prop.getProperty("HotelsPage.OutDate.Xpath"));
		return this;
	}
	
	public HotelsPage clickOnGuest(){
		clickByXpath(prop.getProperty("HotelsPage.Guest.Xpath"));
		return this;
	}
	public HotelsPage SelectOnHotelRoom(String value){
		selectVisibileTextByxpath(prop.getProperty("HotelsPage.HotelRoom.Xpath"), value);
		return this;
	}
	public HotelsPage SelectOnHotelAdult(String value){
		selectVisibileTextByxpath(prop.getProperty("HotelsPage.HotelAdult.Xpath"), value);
		return this;
	}
	public HotelsPage clickOnDone(){
		clickByXpath(prop.getProperty("HotelsPage.Done.Xpath"));
		return this;
	}
	public HotelListPage clickOnSearchHotel(){
		clickByXpath(prop.getProperty("HotelsPage.SearchHotel.Xpath"));
		return new HotelListPage();
	}
}
