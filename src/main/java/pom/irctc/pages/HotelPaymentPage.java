package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPaymentPage extends GenericWrappers{
	public HotelPaymentPage waitPropertyy(long time)  {
	    waitProperty(time);
		return this;
	}

	public HotelPaymentPage clickOnAgree() {
		clickByXpath(prop.getProperty("HotelPaymentPage.Agree.Xpath"));
		return this; 
	}
	public OtpVerifyPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("HotelPaymentPage.MakePayment.Xpath"));
		return new OtpVerifyPage(); 
	}
}
