package pom.facebook.pages;

import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers {
	
	public CreateAccountPage clickOnCreateAccount() {
		clickByXpath(prop.getProperty("HomePage.CreateAccount.XPath"));
	return new CreateAccountPage();
	}
	
}
