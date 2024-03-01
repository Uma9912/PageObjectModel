package pom.ssc.register.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.register.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify new user registration for the Ssc Application";
		author="Uma";
		category="Smoke";
		browserName="chrome";
		url="https://ssc.nic.in/registration/home";
		sheetName="TC009";
	}
	
	@Test(dataProvider = "fetchData")
	public void sscRegistration( String aadharNumber, String verifyAadharNumber, String name, String verifyName ,
			String newName, String fatherName, String verifyFatherName, String motherName, String verifyMotherName,
			String dateOfBirth, String verifyDateOfBirth, String educationBoard,String ddlEducationBoard,
			String secondaryRollNum,String verifySecondaryRollNum,String yearofpassing,String ddlYearofpassing,
			String levelofeducationqualification,String mobileNum, String verifyMobileNum,String emailID,
			String verifyEmailID, String originState) {
		
		new RegistrationPage()
		.clickOnYes()
		.enterAadharNumber(aadharNumber)
		.enterVerifyAadharNumber(verifyAadharNumber)
		.enterName(name)
		.enterVerifyName(verifyName)
		.clickOnChangedNameYes()
		.enterNewName(newName)
		.enterFatherName(fatherName)
		.enterVerifyFatherName(verifyFatherName)
		.enterMotherName(motherName)
		.enterVerifyMotherName(verifyMotherName)
		.enterDateOfBrith(dateOfBirth)
		.enterVerifyDateOfBrith(verifyDateOfBirth)
		.selectOnEducationBoard(educationBoard)
		.selectOnVerifyEducationBoard(ddlEducationBoard)
		.enterRollNumber(secondaryRollNum)
		.enterVerifyRollNumber(verifySecondaryRollNum)
		.selectOnYearPassing(yearofpassing)
		.selectOnVerifyYearPassing(ddlYearofpassing)
		.clickOnGender()
		.clickOnVerifyGender()
		.selectOnEducationalQualification(levelofeducationqualification)
		.enterMobileNumber(mobileNum)
		.enterVerifyMobileNumber(verifyMobileNum)
		.enterEmailId(emailID)
		.enterVerifyEmailId(verifyEmailID)
		.selectOnState(originState)
		.clickOnSave()
		;
	}

}
