package pom.formc.register.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.register.pages.SignUpPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify new user registration for the IndianFrroFormC Application";
		author="Uma";
		category="Smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
	}
	
	@Test(dataProvider = "fetchData")
	public void indianFrroFormC(String userID, String userPassword, String userRepassword, String sectionQuestion,
			String sectionAnswer, String userName , String gender, String dateOfBirth, String userDesignation, String emailID,
			String mobile, String phone, String nationality, String name, String capacity, String address, 
			String state , String city ,String accomodationType , String accomodationGrade , String email,String mcontact, 
			String contact, String name1, String address1, String state1, String city1, String emailID1 ,String phoneNo1,
			String mobile1 ,String name2, String address2, String state2, String city2, String emailID2 ,
	        String phoneNo2,String mobile2,String name3, String address3, String state3, String city3,
			String emailID3 ,String phoneNo3 ,String mobile3) {
		
		new SignUpPage()
		.clickOnRegister()
		.enterUserId(userID)
		.enterPassword(userPassword)
		.enterConfirmPassword(userRepassword)
		.selectOnSecurityQuestion(sectionQuestion)
		.enterAnswer(sectionAnswer)
		.enterName(userName)
		.selectOnGender(gender)
		.enterDateOfBrith(dateOfBirth)
		.enterDesignation(userDesignation)
		.enterEmailId(emailID)
		.enterMobile(mobile)
		.enterPhoneNumber(phone)
		.selectOnNationality(nationality)
		.enterHotelName(name)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectOnState(state)
		.waitPropertyy(3000)
		.selectOnCity(city)
		.selectOnAccomodationType(accomodationType)
		.selectOnAccomodationGrade(accomodationGrade)
		.enterEmail(email)
		.enterMobile1(mcontact)
		.enterPhoneNumber1(contact)
		.enterPassengerName(name1)
		.enterPassengerAddress(address1)
		.selectOnPassengerState(state1)
		.selectOnPassengerCity(city1)
		.enterPassengerEmail(emailID1)
		.enterPassengerPhoneNo(phoneNo1)
		.enterPassengerMobileNo(mobile1)
		.clickOnAdd()
		.enterPassengerNameOne(name2)
		.enterPassengerAddress1(address2)
		.selectOnPassengerState1(state2)
		.waitPropertyy(5000)
		.selectOnPassengerCity1(city2)
		.enterPassengerEmail1(emailID2)
		.enterPassengerPhoneNo1(phoneNo2)
		.enterPassengerMobileNo1(mobile2)
		.clickOnAdd()
		.enterPassengerName2(name3)
		.enterPassengerAddress2(address3)
		.selectOnPassengerState2(state3)
		.waitPropertyy(5000)
		.selectOnPassengerCity2(city3)
		.enterPassengerEmail2(emailID3)
		.enterPassengerPhoneNo2(phoneNo3)
		.enterPassengerMobileNo2(mobile3)
		.clickOnAdd()
		;
		
	}

}
