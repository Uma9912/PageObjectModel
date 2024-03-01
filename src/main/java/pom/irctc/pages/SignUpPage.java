package pom.irctc.pages;

import org.openqa.selenium.Keys;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers {
	
	public SignUpPage  keysPageDown() {
		enterByXpath("//html/body", Keys.PAGE_DOWN);
		return this;
	}
	public SignUpPage enterUserId(String data) {
		enterByXpath(prop.getProperty("SignUpPage.UserId.Xpath"), data);
		return this;
	}
	public SignUpPage enterPassword(String data) {
		enterByXpath(prop.getProperty("SignUpPage.Password.Xpath"), data);
		return this;
	}
	public SignUpPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("SignUpPage.ConfirmPassword.Xpath"), data);
		return this;
	}
	public SignUpPage selectOnSecurityQuestion(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.SecurityQuestion.Xpath"), value);
		return this;
	}
	public SignUpPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("SignUpPage.SecurityAnswer.Xpath"), data);
		return this;
	}
	public SignUpPage clickOnDateOfBirth() {
		clickByXpath(prop.getProperty("SignUpPage.DateOfBirth.Xpath"));
		return this;
	}
	public SignUpPage selectOnMonth(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.Month.Xpath"), value);
		return this;
	}
	public SignUpPage selectOnYear(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.Year.Xpath"), value);
		return this;
	}
	public SignUpPage clickOnDate() {
		clickByXpath(prop.getProperty("SignUpPage.Date.Xpath"));
		return this;
	}
	public SignUpPage clickOnGender() {
		clickByXpath(prop.getProperty("SignUpPage.Gender.Xpath"));
		return this;
	}
	public SignUpPage clickOnMaritalStatus() {
		clickByXpath(prop.getProperty("SignUpPage.MaritalStatus.Xpath"));
		return this;
	}
	public SignUpPage enterEmail(String data) {
		enterByXpath(prop.getProperty("SignUpPage.Email.Xpath"), data);
		return this;
	}
	public SignUpPage selectOnOccupation(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.Occupation.Xpath"), value);
		return this;
	}
	public SignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.FirstName.Xpath"), data);
		return this;
	}
	public SignUpPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.MiddleName.Xpath"), data);
		return this;
	}
	public SignUpPage enterLastName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.LastName.Xpath"), data);
		return this;
	}
	public SignUpPage selectOnNationality(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.Nationality.Xpath"), value);
		return this;
	}
	public SignUpPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("SignUpPage.FlatNo.Xpath"), data);
		return this;
	}
	public SignUpPage enterStreet(String data) {
		enterByXpath(prop.getProperty("SignUpPage.Street.Xpath"), data);
		return this;
	}
	public SignUpPage enterArea(String data) {
		enterByXpath(prop.getProperty("SignUpPage.Area.Xpath"), data);
		return this;
	}
	public SignUpPage selectOnCountry(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.Country.Xpath"), value);
		return this;
	}
	public SignUpPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("SignUpPage.MobileNo.Xpath"), data);
		return this;
	}
	public SignUpPage enterPinCode(String data) {
		enterByXpath(prop.getProperty("SignUpPage.PinCode.Xpath"), data);
		return this;
	}
	public SignUpPage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	public SignUpPage selectOnCity(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.City.Xpath"), value);
		return this;
	}
	public SignUpPage selectOnState(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.State.Xpath"), value);
		return this;
	}
	public SignUpPage selectOnPostOffice(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.PostOffice.Xpath"), value);
		return this;
	}
	public SignUpPage clickOnResidentialAddress() {
		clickByXpath(prop.getProperty("SignUpPage.ResidentialAddress.Xpath"));
		return this;
	}
	public SignUpPage enterOfficeFlatNo(String data) {
		enterByXpath(prop.getProperty("SignUpPage.OfficeFlatNo.Xpath"), data);
		return this;
	}
	public SignUpPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("SignUpPage.OfficeStreet.Xpath"), data);
		return this;
	}
	public SignUpPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("SignUpPage.OfficeArea.Xpath"), data);
		return this;
	}
	public SignUpPage selectOnCountryOffice(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.CountryOffice.Xpath"), value);
		return this;
	}
	public SignUpPage enterMobileOffice(String data) {
		enterByXpath(prop.getProperty("SignUpPage.MobileOffice.Xpath"), data);
		return this;
	}
	public SignUpPage enterOfficePinCode(String data) {
		enterByXpath(prop.getProperty("SignUpPage.OfficePinCode.Xpath"), data);
		return this;
	}
	public SignUpPage selectOnCityOffice(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.CityOffice.Xpath"), value);
		return this;
	}
	public SignUpPage selectOnStateOffice(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.StateOffice.Xpath"), value);
		return this;
	}
	public SignUpPage selectOnPostOffice1(String value) {
		selectVisibileTextByxpath(prop.getProperty("SignUpPage.PostOffice1.Xpath"), value);
		return this;
	}
}
