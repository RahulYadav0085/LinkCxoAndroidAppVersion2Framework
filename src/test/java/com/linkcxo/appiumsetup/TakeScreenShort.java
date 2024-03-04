package com.linkcxo.appiumsetup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenShort {

    public  void takeScreenshot(AppiumDriver<MobileElement> driver, String testName) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotDir = "Reports//Screenshot//";

        File directory = new File(screenshotDir);
        if (!directory.exists()) {
            directory.mkdir();
        }

        String screenshotPath = screenshotDir + testName + "_" + timeStamp + ".png";

        try {
            FileHandler.copy(screenshotFile, new File(screenshotPath));
            System.out.println("Screenshot saved to: " + screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

