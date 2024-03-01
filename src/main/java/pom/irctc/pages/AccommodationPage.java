package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{

	public AccommodationPage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	public AccommodationPage switchToWindow()  {
		switchToLastWindow();
		return this;
	}
	public AccommodationPage clickOnSidebarCollapse() {
		clickByXpath(prop.getProperty("AccommodationPage.SidebarCollapse.Xpath"));
		return this;
	}
	
	public FtrPage clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("AccommodationPage.BookYourCoach.Xpath"));
		return new FtrPage();
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.Charter.Xpath"));
		return new CharterPage();
	}
	
	public LoginPage clickOnHotels() {
		clickByXpath(prop.getProperty("AccommodationPage.Hotels.Xpath"));
		return new LoginPage();
	}


	
}


