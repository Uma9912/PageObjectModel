package pom.formc.register.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{
	
	public RegisterPage clickOnRegister() {
		clickByXpath(prop.getProperty("SignUpPage.Register.Xpath"));
		return new RegisterPage();	
	}

}
