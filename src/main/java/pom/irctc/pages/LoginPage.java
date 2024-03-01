package pom.irctc.pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	public LoginPage switchToWindow()  {
		switchToLastWindow();
		return this;
	}
	public LoginPage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	public LoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("LoginPage.Login.Xpath"));
		return this;
	}

	public LoginPage clickOnGuestUserLogin() {
	clickByXpath(prop.getProperty("LoginPage.GuestUserLogin.Xpath"));
	return this;
	}
	
	public LoginPage enterEmail(String data) {
		enterByXpath(prop.getProperty("LoginPage.Email.Xpath"), data);
		return this;
	}
	public LoginPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("LoginPage.MobileNumber.Xpath"), data);
		return this;		
	}
	
	public HotelsPage clickOnLogin1() {
		clickByXpath(prop.getProperty("LoginPage.Login1.Xpath"));
		return new HotelsPage();
	}
	
	
}
