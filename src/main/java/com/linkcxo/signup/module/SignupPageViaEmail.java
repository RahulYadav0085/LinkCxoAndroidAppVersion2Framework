package com.linkcxo.signup.module;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class SignupPageViaEmail{
	
	AppiumDriver<MobileElement> driver;
	public SignupPageViaEmail(AppiumDriver<MobileElement> d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (xpath="//android.widget.EditText[@text='Enter your First Name']")
	WebElement Fnametxt;
	@FindBy (xpath="//android.widget.EditText[@text='Enter your Last Name']")
	WebElement Lnametxt;
	@FindBy (xpath="//android.widget.EditText[@text='Add your Current Company']")
	WebElement Companytxt;
	@FindBy (xpath="//android.widget.EditText[@text='Select Designation']")
	WebElement Designationtxt;
	@FindBy (xpath="//android.widget.EditText[@text='Years Of Experience']")
	WebElement Experiencetxt;
	@FindBy (xpath="//android.widget.EditText[@text='Enter Your Phone Number']")
	WebElement Phonetxt;
	@FindBy (xpath="//android.widget.EditText[@text='Enter Social Media Url']")
	WebElement Socialtxt;
	String visibleText="Head HR";
	String scroll = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + visibleText + "\").instance(0));";
	@FindBy (xpath="scroll")
	WebElement Scrolltxt;
	
	
public void signupwithemail() throws InterruptedException {
	Fnametxt.click();
	Thread.sleep(1000);
	Lnametxt.click();
	Thread.sleep(1000);
	Companytxt.click();
	Thread.sleep(1000);
	Designationtxt.click();
	Thread.sleep(1000);
	Scrolltxt.click();
	Thread.sleep(1000);
	Experiencetxt.click();
	Thread.sleep(1000);
	Phonetxt.click();
	Thread.sleep(1000);
	Socialtxt.click();
	
}

}

