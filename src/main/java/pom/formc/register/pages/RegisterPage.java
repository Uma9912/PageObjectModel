package pom.formc.register.pages;

import wrappers.GenericWrappers;

public class RegisterPage extends GenericWrappers{

	public RegisterPage enterUserId(String data) {
		enterByXpath(prop.getProperty("RegisterPage.UserId.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Password1.Xpath"), data);
		return this;
	}
	public RegisterPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegisterPage.ConfirmPassword.Xpath"), data);
		return this;
	}
	public RegisterPage selectOnSecurityQuestion(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.SecurityQuestion.Xpath"), value);
		return this;
	}
	public RegisterPage enterAnswer(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Answer.Xpath"), data);
		return this;
	}
	public RegisterPage enterName(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Name.Xpath"), data);
		return this;
	}
	public RegisterPage selectOnGender(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.Gender.Xpath"), value);
		return this;
	}
	public RegisterPage enterDateOfBrith(String data) {
		enterByXpath(prop.getProperty("RegisterPage.DateOfBrith.Xpath"), data);
		return this;
	}
	public RegisterPage enterDesignation(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Designation.Xpath"), data);
		return this;
	}
	public RegisterPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("RegisterPage.EmailId.Xpath"), data);
		return this;
	}
	public RegisterPage enterMobile(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Mobile.Xpath"), data);
		return this;
	}
	public RegisterPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PhoneNumber.Xpath"), data);
		return this;
	}
	public RegisterPage selectOnNationality(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.Nationality.Xpath"), value);
		return this;
	}
	public RegisterPage enterHotelName(String data) {
		enterByXpath(prop.getProperty("RegisterPage.HotelName.Xpath"), data);
		return this;
	}
	public RegisterPage enterCapacity(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Capacity.Xpath"), data);
		return this;
	}
	public RegisterPage enterAddress(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Address.Xpath"), data);
		return this;
	}
	public RegisterPage selectOnState(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.State.Xpath"), value);
		return this;
	}
	public RegisterPage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	public RegisterPage selectOnCity(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.City.Xpath"), value);

		return this;
	}
	public RegisterPage selectOnAccomodationType(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.AccomodationType.Xpath"), value);
		return this;
	}
	public RegisterPage selectOnAccomodationGrade(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.AccomodationGrade.Xpath"), value);
		return this;
	}
	public RegisterPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Email.Xpath"), data);
		return this;
	}
	public RegisterPage enterMobile1(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Mobile1.Xpath"), data);
		return this;
	}
	public RegisterPage enterPhoneNumber1(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PhoneNumber1.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerName(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerName.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerAddress(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerAddress.Xpath"), data);
		return this;
	}
	public RegisterPage selectOnPassengerState(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.PassengerState.Xpath"), value);
		return this;
	}
	public RegisterPage selectOnPassengerCity(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.PassengerCity.Xpath"), value);
		return this;
	}
	public RegisterPage enterPassengerEmail(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerEmail.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerPhoneNo(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerPhoneNo.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerMobileNo(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerMobileNo.Xpath"), data);
		return this;
	}
	public RegisterPage clickOnAdd() {
		clickByXpath(prop.getProperty("RegisterPage.Add.Xpath"));
		return this;
	}
	public RegisterPage enterPassengerNameOne(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerNameOne.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerAddress1(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerAddress1.Xpath"), data);
		return this;
	}
	public RegisterPage selectOnPassengerState1(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.PassengerState1.Xpath"), value);
		return this;
	}
	public RegisterPage selectOnPassengerCity1(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.PassengerCity1.Xpath"), value);
		return this;
	}
	public RegisterPage enterPassengerEmail1(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerEmail1.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerPhoneNo1(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerPhoneNo1.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerMobileNo1(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerMobileNo1.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterPassengerName2(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerNameTwo.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterPassengerAddress2(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerAddress2.Xpath"), data);
		return this;
	}
	public RegisterPage selectOnPassengerState2(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.PassengerState2.Xpath"), value);
		return this;
	}
	public RegisterPage selectOnPassengerCity2(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterPage.PassengerCity2.Xpath"), value);
		return this;
	}
	public RegisterPage enterPassengerEmail2(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerEmail2.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerPhoneNo2(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerPhoneNo2.Xpath"), data);
		return this;
	}
	public RegisterPage enterPassengerMobileNo2(String data) {
		enterByXpath(prop.getProperty("RegisterPage.PassengerMobileNo2.Xpath"), data);
		return this;
	}
	
	
}
