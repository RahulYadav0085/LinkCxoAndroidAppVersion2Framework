package com.linkcxo.testscript;

import org.testng.annotations.Test;

import com.linkcxo.appiumsetup.TakeScreenShort;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenShortCaptureError extends TakeScreenShort {
	
	
	@Test
	public static void main(String[] args) {
        // Example usage
        AppiumDriver<MobileElement> driver = // initialize your Appium driver here

        try {
            // Trigger an error (for demonstration purposes)
            driver.findElementByAccessibilityId("nonExistentElement").click();
        } catch (Exception e) {
            // If an error occurs, take a screenshot
            TakeScreenShort(driver, "error_test");
        } finally {
            // Close the driver
            if (driver != null) {
                driver.quit();
            }
        
	
}
}
}

