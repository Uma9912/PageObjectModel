package pom.facebook.pages;

import wrappers.GenericWrappers;

public class CreateAccountPage extends GenericWrappers{
	
	public CreateAccountPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.FirstName.XPath"), data);
		return this;
	}
	public CreateAccountPage enterSurName(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.LastName.XPath"), data);
		return this;
	}
	public CreateAccountPage enterEmail(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.Email.Xpath"), data);
		return this;
	}
	public CreateAccountPage enterConfirmEmail(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.ConfirmEmailAddress.Xpath"), data);
		return this;
	}
	public CreateAccountPage enterPassword(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.Password.Xpath"), data);
		return this;
	}
	public CreateAccountPage selectOnDay(String value) {
		selectVisibileTextByxpath(prop.getProperty("CreateAccountPage.Day.Xpath"), value);
		return this;
	}
	public CreateAccountPage selectOnMonth(String value) {
		selectVisibileTextByxpath(prop.getProperty("CreateAccountPage.Month.Xpath"), value);
		return this;
	}
	public CreateAccountPage selectOnYear(String value) {
		selectVisibileTextByxpath(prop.getProperty("CreateAccountPage.Year.Xpath"), value);
		return this;
	}
	public CreateAccountPage clickOnGender() {
		clickByXpath(prop.getProperty("CreateAccountPage.Gender.Xpath"));
	   return this;
	}
}
