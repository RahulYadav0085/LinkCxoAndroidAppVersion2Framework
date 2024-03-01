package com.linkcxo.pages;

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
	
	
	public void loginwithemail(String Email) throws InterruptedException {
		Logintxt.click();
		Thread.sleep(1000);
		LoginEntry.click();
		Thread.sleep(1000);
		LoginEntry.sendKeys(Email);
		Thread.sleep(1000);
		Loginbtn.click();
	}
		
	 public void screenshotimage() throws IOException {
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String screenshotPath = "C:\\Users\\rahul\\eclipse-workspace\\LinkCxoAndroidAppVersion2Framework\\target\\websiteScreenshot.png";
			FileUtils.moveDirectory(screenshotFile, screenshotFile);
			 
		 }
	
	
	
}
