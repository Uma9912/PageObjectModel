package pom.irctc.pages;



import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.Xpath"), data);
		return this;
	}
	
	public RegistrationPage clickOnPreferredLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguage.Xpath"));
	return this;
	}
	
	public RegistrationPage clickOnEnglish() {
		clickByXpath(prop.getProperty("RegistrationPage.English.Xpath"));
	return this;
	}
	
	public RegistrationPage clickOnSecurityQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.Xpath"));
	return this;
	}
	
	public RegistrationPage clickOnSecurityQuestionOptions() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestionOptions.Xpath"));
	return this;
	}
	
	public RegistrationPage clickOnSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.Xpath"), data);
	return this;
	}
	
	public RegistrationPage clickOnContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.Continue.Xpath"));
	return this;
	}
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage clickOnSelectOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.Occupation.Xpath"));
	return this;
	}
	public RegistrationPage clickOnProfessional() {
		clickByXpath(prop.getProperty("RegistrationPage.Professional.Xpath"));
	return this;
	}
	
	public RegistrationPage clickOnDateOfBirth() {
		clickByXpath(prop.getProperty("RegistrationPage.DateOfBirth.Xpath"));
	return this;
	}
	
	public RegistrationPage selectOnYear(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.Year.Xpath"), value);
	return this;
	}
	
	public RegistrationPage selectOnMonth(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.Month.Xpath"), value);
	return this;
	}
	
	public RegistrationPage clickOnDate() {
		clickByXpath(prop.getProperty("RegistrationPage.Date.Xpath"));
	return this;
	}
	
	public RegistrationPage clickOnGender() {
		clickByXpath(prop.getProperty("RegistrationPage.Gender.Xpath"));
	return this;
	}
	
	public RegistrationPage selectOnCountry(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.Country.Xpath"), value);
	return this;
	}
	
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.Xpath"), data);
		return this;
	}
	
	public RegistrationPage selectOnNationality(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.Nationality.Xpath"), value);
	return this;
	}
	
	public RegistrationPage clickOnContinue1() {
		clickByXpath(prop.getProperty("RegistrationPage.Continue1.Xpath"));
	return this;
	}
	
	public RegistrationPage enterAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Address.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterStreetLine(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.StreetLine.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Area.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterPinCode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.PinCode.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterState(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.State.Xpath"), data);
		return this;
	}
	
	public RegistrationPage selectOnCity(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.City.Xpath"), value);
	return this;
	}
	
	public RegistrationPage selectOnPostOffice(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.PostOffice.Xpath"), value);
	return this;
	}
	
	public RegistrationPage enterPhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone.Xpath"), data);
		return this;
	}
	
	public RegistrationPage clickOnNo() {
		clickByXpath(prop.getProperty("RegistrationPage.No.Xpath"));
	return this;
	}
	
	public RegistrationPage enterOfficeAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeAddress.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeStreetLine(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeStreetLine.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeArea.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficePinCode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePinCode.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeState(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeState.Xpath"), data);
		return this;
	}
	
	public RegistrationPage selectOnOfficeCity(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.OfficeCity.Xpath"), value);
	return this;
	}
	
	public RegistrationPage selectOnOfficePostOffice(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.OfficePostOffice.Xpath"), value);
	return this;
	}
	
	public RegistrationPage enterOfficePhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePhone.Xpath"), data);
		return this;
	}
	
	
	
	
	
}
	

