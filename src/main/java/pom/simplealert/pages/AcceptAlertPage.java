package pom.simplealert.pages;

import wrappers.GenericWrappers;

public class AcceptAlertPage extends GenericWrappers {
	
	public AcceptAlertPage getTextAlert() {
		getAlertTextNoSnap();
		return this;
	}
	public AcceptAlertPage acceptTheAlert() {
		acceptAlert();
		return this;
	}
	public AcceptAlertPage switchToDefaultContent() {
		switchTodefaultContent();
		return this;
	}
	public AcceptAlertPage clickOnHome() {
		clickByXpath(prop.getProperty("AcceptAlertPage.Home.Xpath"));
		return this;
	}
}
