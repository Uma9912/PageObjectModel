package pom.irctc.pages;

import org.openqa.selenium.Keys;

import wrappers.GenericWrappers;

public class HotelPersonalDetailsPage extends GenericWrappers {
	
	public HotelPersonalDetailsPage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	public HotelPersonalDetailsPage  keysPageDown() {
		enterByXpath("//html/body", Keys.PAGE_DOWN);
		return this;
	}
	
	public HotelPersonalDetailsPage clickOnTitle(String value) {
		selectVisibileTextByxpath(prop.getProperty("HotelPersonalDetailsPage.Title.Xpath"), value);
		return this;
	}
	public HotelPersonalDetailsPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("HotelPersonalDetailsPage.FirstName.Xpath"), data);
		return this;
	}
	public HotelPersonalDetailsPage enterLastName(String data) {
		enterByXpath(prop.getProperty("HotelPersonalDetailsPage.LastName.Xpath"), data);
		return this;
	}
	public HotelPersonalDetailsPage selectOnCountry(String value) {
		selectVisibileTextByxpath(prop.getProperty("HotelPersonalDetailsPage.Country.Xpath"), value);
		return this;
	}
	public HotelPersonalDetailsPage selectOnState(String value) {
		selectVisibileTextByxpath(prop.getProperty("HotelPersonalDetailsPage.State.Xpath"), value);
		return this;
	}
	public HotelPersonalDetailsPage selectOnGst(String value) {
		selectVisibileTextByxpath(prop.getProperty("HotelPersonalDetailsPage.Gst.Xpath"), value);
		return this;
	}
	public HotelPersonalDetailsPage verifyContainsHotelName(String text) {
		verifyTextContainsByXpath(prop.getProperty("HotelPersonalDetailsPage.HotelName1.Xpath"), text);
		return this;
	}
	public HotelPersonalDetailsPage verifyContainsHotelPrice(String text) {
		verifyTextContainsByXpath(prop.getProperty("HotelPersonalDetailsPage.HotelPrice1.Xpath"), text);
		return this;
	}

	public HotelPersonalDetailsPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("HotelPersonalDetailsPage.CompanyName.Xpath"), data);
		return this;
	}
	public HotelPersonalDetailsPage enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("HotelPersonalDetailsPage.CompanyAddress.Xpath"), data);
		return this;
	}
	public HotelPersonalDetailsPage verifyContainsGstNumber(String text) {
		verifyTextContainsByXpath(prop.getProperty("HotelPersonalDetailsPage.GstNumber.Xpath"), text);
		return this;
	}
	public HotelPersonalDetailsPage clickOnContinueOption() {
		clickByXpath(prop.getProperty("HotelPersonalDetailsPage.Continue1.Xpath"));
		return this;
	}
	public HotelPaymentPage clickOnContinue() {
		clickByXpath(prop.getProperty("HotelPersonalDetailsPage.Continue2.Xpath"));
		return new HotelPaymentPage();
	}
	}
