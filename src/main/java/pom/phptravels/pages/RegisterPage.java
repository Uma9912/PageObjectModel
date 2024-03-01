package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class RegisterPage extends GenericWrappers{
	
	public RegisterPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.FirstName"), data);
		return this;
	}
	public RegisterPage enterLastName(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.LastName"), data);
		return this;
	}
	public RegisterPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.Email"), data);
		return this;
	}
	public RegisterPage enterPhoneNo(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.PhoneNo"), data);
		return this;
	}
	public RegisterPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.CompanyName"), data);
		return this;
	}
	public RegisterPage enterStreetAddress(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.StreetAddress"), data);
		return this;
	}
	public RegisterPage enterStreetAddress2(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.StreetAddress2"), data);
		return this;
	}
	public RegisterPage enterCity(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.City"), data);
		return this;
	}
	public RegisterPage enterState(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.State"), data);
		return this;
	}
	public RegisterPage enterPostCode(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.PostCode"), data);
		return this;
	}
	public RegisterPage selectOnCountry(String value) {
		selectVisibileTextByxpath(prop.getProperty("PhpTravels.RegisterPage.Country"), value);
		return this;
	}
	public RegisterPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.PhoneNumber"), data);
		return this;
	}
	public RegisterPage enterPassword(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.Password"), data);
		return this;
	}
	public RegisterPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("PhpTravels.RegisterPage.ConfirmPassword"), data);
		return this;
	}
	public RegisterPage clickOnGeneratePassword() {
		clickByXpath(prop.getProperty("PhpTravels.RegisterPage.GeneratePassword"));
		return this;
	}
	public RegisterPage clickOnNewGeneratePassword() {
		clickByXpath(prop.getProperty("PhpTravels.RegisterPage.NewGeneratePassword"));
		return this;
	}
	public RegisterPage clickOnCopy() {
		clickByXpath(prop.getProperty("PhpTravels.RegisterPage.Copy"));
		return this;
	}
	public RegisterPage clickOnClipBoard() {
		clickByXpath(prop.getProperty("PhpTravels.RegisterPage.ClipBoard"));
		return this;
	}

}
