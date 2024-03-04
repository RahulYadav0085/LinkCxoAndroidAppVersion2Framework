package com.linkcxo.signup.module;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class LoginPageViaEmail {
	AppiumDriver<MobileElement> driver;
	public LoginPageViaEmail(AppiumDriver <MobileElement>d) {
		driver=d;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='Continue with Email or Mobile No.']")
           WebElement Logintxt;
	 @FindBy(xpath = "//android.widget.EditText[@text='Your Email or Mobile No']")
	        WebElement LoginEntry;
	 @FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue to Send OTP\"]/android.widget.TextView")
	       WebElement Loginbtn;
	 @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]")
	       WebElement Otptxt0;
	 @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[2]")
	       WebElement Otptxt1;
	 @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[3]")
	       WebElement Otptxt2;
	 @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[4]")
	       WebElement Otptxt3;
	 @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[5]")
	       WebElement Otptxt4;
	 @FindBy(xpath ="/h5ierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[6]")
           WebElement Otptxt5;
	
	
	public void loginwithemail(String Email) throws InterruptedException {
		Logintxt.click();
		Thread.sleep(1000);
		LoginEntry.click();
		Thread.sleep(1000);
		LoginEntry.sendKeys(Email);
		Thread.sleep(1000);
		Loginbtn.click();
	} 
	
	public void otpmethod(String Otp) throws InterruptedException {
		
		Otptxt0.click();
		Thread.sleep(1000);
		Otptxt0.sendKeys(Otp);
		Thread.sleep(1000);
		Otptxt1.click();
		Thread.sleep(1000);
		Otptxt1.sendKeys(Otp);
		Thread.sleep(1000);
		Otptxt2.click();
		Thread.sleep(1000);
		Otptxt2.sendKeys(Otp);
		Thread.sleep(1000);
		Otptxt3.click();
		Thread.sleep(1000);
		Otptxt3.sendKeys(Otp);
		Thread.sleep(1000);
		Otptxt4.click();
		Thread.sleep(1000);
		Otptxt4.sendKeys(Otp);
		Thread.sleep(1000);
		Otptxt5.click();
		Thread.sleep(1000);
		Otptxt5.sendKeys(Otp);
		Thread.sleep(1000);
		
		
		
	}
}
