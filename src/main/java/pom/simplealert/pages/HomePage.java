package pom.simplealert.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public HomePage switchToFrame() {
		switchToframeUsingId(prop.getProperty("HomePage.Frame.Xpath"));
		return this;
	}
	public AcceptAlertPage clickOnTryIt() {
		clickByXpathNoSnap(prop.getProperty("HomePage.TryIt.Xpath"));
		return new AcceptAlertPage();
	}
}
