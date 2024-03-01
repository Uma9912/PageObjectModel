package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers{
	
	public FtrPage switchToWindow()  {
		switchToLastWindow();
		return this;
	}
	public SignUpPage clickOnNewSignUp() {
		clickByXpath(prop.getProperty("FtrPage.NewSignUp.Xpath"));
		return new SignUpPage();
	}
	
	

}
