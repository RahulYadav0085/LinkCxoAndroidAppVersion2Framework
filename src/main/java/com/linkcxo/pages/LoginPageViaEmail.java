package com.linkcxo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageViaEmail {
	AppiumDriver<MobileElement> driver;
	public LoginPageViaEmail(AppiumDriver <MobileElement>driver) {
		this.driver=driver;
	
	}

	
	By Logintxt=MobileBy.xpath("//android.widget.TextView[@text='Continue with Email or Mobile No.']");
	By LoginEntry=MobileBy.xpath("//android.widget.EditText[@text='Your Email or Mobile No']");
    By Loginbtn=MobileBy.xpath("//android.widget.Button[@content-desc=\"Continue to Send OTP\"]/android.widget.TextView");	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue with Email or Mobile No.']")
//      private MobileElement Logintxt;
//	 
//	 @AndroidFindBy(xpath = "//android.widget.EditText[@text='Your Email or Mobile No']")
//	 private MobileElement LoginEntry;
//	 
//	 @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue to Send OTP\"]/android.widget.TextView")
//	 private MobileElement Loginbtn;
//	
	
	public void loginwithemail(String Email) throws InterruptedException {
	 driver.findElement(Logintxt).click();
	Thread.sleep(1000);
	driver.findElement(LoginEntry).click();

	Thread.sleep(1000);
	driver.findElement(LoginEntry).sendKeys(Email);
	
	Thread.sleep(1000);
    driver.findElement(Loginbtn).click();
	Thread.sleep(1000);
//		Logintxt.click();
//		Thread.sleep(1000);
//		LoginEntry.click();
//		Thread.sleep(1000);
//		LoginEntry.sendKeys(Email);
//		Thread.sleep(1000);
//		Loginbtn.click();
//		
	
	}
}
