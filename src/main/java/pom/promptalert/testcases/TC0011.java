package pom.promptalert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.promptalert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC0011 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC0011";
		testCaseDescription="To verify the PromptAlert Application";
		author="Uma";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	    sheetName="TC0011";
	}
	
@Test(dataProvider = "fetchData")
	public void promptAlert(String name, String demo, String name1, String demo1) {
		
		new HomePage()
		.switchToFrame()
		.clickOnTryIt()
		.enterName(name)
		.getTextAlert()
		.acceptTheAlert()
		.verifyText(demo)
		.enterRefresh()
		.switchToFrame()
		.clickOnTryIt()
		.enterName(name1)
		.getTextAlert()
		.dismissTheAlert()
		.verifyText(demo1)
		.switchToDefaultContent()
		.clickOnHome()
		;
	}
}
