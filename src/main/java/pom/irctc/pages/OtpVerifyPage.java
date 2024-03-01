package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpVerifyPage extends GenericWrappers {
	public OtpVerifyPage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}
	public OtpVerifyPage clickOnOtpVerify() {
		clickByXpath(prop.getProperty("OtpVerifyPage.OtpVerify.Xpath"));
		return this;
	}
	public OtpVerifyPage verifyTextOtp(String text) {
		verifyTextByXpath(prop.getProperty("OtpVerifyPage.Otp.Xpath"), text);
		return this;
	}

}
