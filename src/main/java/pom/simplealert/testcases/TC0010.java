package pom.simplealert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.simplealert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC0010 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC0010";
		testCaseDescription="To verify the SimpleAlert Application";
		author="Uma";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	@Test
	public void simpleAlert() {
		
		new HomePage()
		.switchToFrame()
		.clickOnTryIt()
		.getTextAlert()
		.acceptTheAlert()
		.switchToDefaultContent()
		.clickOnHome()
		;
	}

}
