package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.Xpath"));
		return this;
	}
	public CharterPage enterName(String data) {
		enterByXpath(prop.getProperty("CharterPage.Name.Xpath"), data);
		return this;
	}
	public CharterPage enterOrganisation(String data) {
		enterByXpath(prop.getProperty("CharterPage.Organisation.Xpath"), data);
		return this;
	}
	public CharterPage enterAddress(String data) {
		enterByXpath(prop.getProperty("CharterPage.Address.Xpath"), data);
		return this;
	}
	public CharterPage enterMobile(String data) {
		enterByXpath(prop.getProperty("CharterPage.Mobile.Xpath"), data);
		return this;
	}
	public CharterPage enterEmail(String data) {
		enterByXpath(prop.getProperty("CharterPage.Email.Xpath"), data);
		return this;
	}
	public CharterPage selectOnOption(String value) {
		selectVisibileTextByxpath(prop.getProperty("CharterPage.Option.Xpath"), value);
		return this;
	}
	public CharterPage enterOriginatingStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.OriginatingStation.Xpath"), data);
		return this;
	}
	public CharterPage enterDestinationStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.DestinationStation.Xpath"), data);
		return this;
	}
	public CharterPage clickOnCheckInDate() {
		clickByXpath(prop.getProperty("CharterPage.CheckInDate.Xpath"));
		return this;
	}
	public CharterPage clickOnDate() {
		clickByXpath(prop.getProperty("CharterPage.Date.Xpath"));
		return this;
	}
	public CharterPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("CharterPage.CheckOutDate.Xpath"));
		return this;
	}
	public CharterPage clickOnOutDate() {
		clickByXpath(prop.getProperty("CharterPage.OutDate.Xpath"));
		return this;
	}
	public CharterPage enterDurationOfTour(String data) {
		enterByXpath(prop.getProperty("CharterPage.DurationOfTour.Xpath"), data);
		return this;
	}
	public CharterPage enterCoachesRequired(String data) {
		enterByXpath(prop.getProperty("CharterPage.CoachesRequired.Xpath"), data);
		return this;
	}
	public CharterPage enterNumberOfPassengers(String data) {
		enterByXpath(prop.getProperty("CharterPage.NumberOfPassengers.Xpath"), data);
		return this;
	}
	public CharterPage enterNumberOfPassengers1(String data) {
		enterByXpath(prop.getProperty("CharterPage.NumberOfPassengers1.Xpath"), data);
		return this;
	}
	public CharterPage enterCharterPurpose(String data) {
		enterByXpath(prop.getProperty("CharterPage.CharterPurpose.Xpath"), data);
		return this;
	}
	public CharterPage enterServices(String data) {
		enterByXpath(prop.getProperty("CharterPage.Services.Xpath"), data);
		return this;
	}
	public CharterPage clickOnSubmit() {
		clickByXpath(prop.getProperty("CharterPage.Submit.Xpath"));
		return this;
	}
	public CharterPage verifyTextOnMoblie(String text) {
		verifyTextByXpath("//span[text()='Mobile no. not valid']", text);
		return this;
	}
	

	
}
