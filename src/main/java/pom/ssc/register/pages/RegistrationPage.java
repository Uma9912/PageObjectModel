package pom.ssc.register.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage clickOnYes() {
		clickByXpath(prop.getProperty("RegistrationPage.AadharYes.Xpath"));
		return this;	
	}
	public RegistrationPage enterAadharNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.AadharNumber.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterVerifyAadharNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyAadharNumber.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Name.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterVerifyName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyName.Xpath"), data);
		return this;	
	}
	public RegistrationPage clickOnChangedNameYes() {
		clickByXpath(prop.getProperty("RegistrationPage.ChangedNameYes.Xpath"));
		return this;	
	}
	public RegistrationPage enterNewName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.NewName.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterFatherName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FatherName.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterVerifyFatherName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyFatherName.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterMotherName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MotherName.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterVerifyMotherName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyMotherName.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterDateOfBrith(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.DateOfBirth1.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterVerifyDateOfBrith(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyDateOfBirth.Xpath"), data);
		return this;	
	}
	public RegistrationPage selectOnEducationBoard(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.EducationBoard.Xpath"), value);
		return this;	
	}
	public RegistrationPage selectOnVerifyEducationBoard(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.VerifyEducationBoard.Xpath"), value);
		return this;	
	}
	public RegistrationPage enterRollNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RollNumber.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterVerifyRollNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyRollNumber.Xpath"), data);
		return this;	
	}
	public RegistrationPage selectOnYearPassing(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.YearPassing.Xpath"), value);
		return this;	
	}
	public RegistrationPage selectOnVerifyYearPassing(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.VerifyYearPassing.Xpath"), value);
		return this;	
	}
	public RegistrationPage clickOnGender() {
		clickByXpath(prop.getProperty("RegistrationPage.Gender1.Xpath"));
		return this;	
	}
	public RegistrationPage clickOnVerifyGender() {
		clickByXpath(prop.getProperty("RegistrationPage.VerifyGender.Xpath"));
		return this;	
	}
	public RegistrationPage selectOnEducationalQualification(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.EducationalQualification.Xpath"), value);
		return this;	
	}
	public RegistrationPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MobileNumber.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterVerifyMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyMobileNumber.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.EmailId.Xpath"), data);
		return this;	
	}
	public RegistrationPage enterVerifyEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyEmailId.Xpath"), data);
		return this;	
	}
	public RegistrationPage selectOnState(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegistrationPage.State1.Xpath"), value);
		return this;	
	}
	public RegistrationPage clickOnSave() {
		clickByXpath(prop.getProperty("RegistrationPage.Save.Xpath"));
		return this;	
	}
}
