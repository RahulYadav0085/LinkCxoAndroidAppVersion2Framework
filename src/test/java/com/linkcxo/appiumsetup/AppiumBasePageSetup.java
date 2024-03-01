package com.linkcxo.appiumsetup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumBasePageSetup {
	protected AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "LinkCxoPhone");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("PlatformVersion", "14");
		cap.setCapability("app", "D://LinkCxO//application.apk");
		 
	 driver=new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void teardown() {
		if(driver!=null) {
		driver.quit();
		}
	}
}
