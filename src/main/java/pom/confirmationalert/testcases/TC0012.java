package pom.confirmationalert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.confirmationalert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC0012 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC0012";
		testCaseDescription="To Verify the ConfirmationAlert Application";
		author="Uma";
		category="Smoke";
		browserName="chrome";
		url=" https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		sheetName="TC0012";
	}
	
@Test(dataProvider = "fetchData")
	public void confirmationAlert(String demo , String demo1) {
		
		new HomePage()
		.switchToFrame()
		.clickOnTryIt()
		.getTextAlert()
		.acceptTheAlert()
		.verifyText(demo)
		.enterRefresh()
	    .switchToFrame()
	    .clickOnTryIt()
		.getTextAlert()
		.dismissTheAlert()
		.verifyText(demo1)
		.switchToDefaultContent()
		.clickOnHome()
		;
	} 
}
