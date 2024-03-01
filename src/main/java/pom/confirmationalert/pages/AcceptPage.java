package pom.confirmationalert.pages;

import wrappers.GenericWrappers;

public class AcceptPage extends GenericWrappers {
	
	
	public AcceptPage getTextAlert() {
		getAlertTextNoSnap();
		return this;
	}
	public AcceptPage acceptTheAlert() {
		acceptAlert();
		return this;
	}
	public AcceptPage verifyText(String text) {
	verifyTextByXpath(prop.getProperty("AcceptPage.verifyText.Xpath"), text);
		return this;
	}
	public HomePage enterRefresh() {
		refresh();
		return new HomePage();
	}
	public AcceptPage dismissTheAlert() {
		dismissAlert();
		return this;
	}
	public AcceptPage  switchToDefaultContent() {
		switchTodefaultContent();
		return this;
	}
	public AcceptPage clickOnHome() {
		clickByXpath(prop.getProperty("AcceptPage.Home.Xpath"));
		return this;
	}
}
