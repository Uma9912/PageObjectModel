package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	
	public RegistrationPage clickOnRegister()  {
		clickByXpath(prop.getProperty("HomePage.Register.Xpath"));
	return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXPath(prop.getProperty("HomePage.Holidays.Xpath"));
		return this;
	}
	public HomePage mouseHoverOnStays() {
		mouseHoverByXPath(prop.getProperty("HomePage.Stays.Xpath"));
		return this;
	}

	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.Xpath"));
		return new AccommodationPage();
	}
	
}
