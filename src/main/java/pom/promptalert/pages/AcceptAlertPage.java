package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class AcceptAlertPage extends GenericWrappers {
	
	public AcceptAlertPage enterName(String data) {
		sendkeysAlert(data);
		return this;
	}
	public AcceptAlertPage getTextAlert() {
		getAlertTextNoSnap();
		return this;
	}
	public AcceptAlertPage acceptTheAlert() {
		acceptAlert();
		return this;
	}
	public AcceptAlertPage verifyText(String text) {
	verifyTextByXpath(prop.getProperty("AcceptAlertPage.verifyText.Xpath"), text);
		return this;
	}
	public HomePage enterRefresh() {
		refresh();
		return new HomePage();
	}
	public AcceptAlertPage dismissTheAlert() {
		dismissAlert();
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
