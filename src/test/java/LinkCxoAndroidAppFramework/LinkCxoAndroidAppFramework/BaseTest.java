package LinkCxoAndroidAppFramework.LinkCxoAndroidAppFramework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.linkcxo.pages.LoginPageViaEmail;
import com.linkcxo.utils.AppiumBasePageSetup;

import io.appium.java_client.AppiumDriver;

public class BaseTest extends AppiumBasePageSetup {
      LoginPageViaEmail email;
	
	
	@Test
	public void linkcxo() throws InterruptedException {
		email=new LoginPageViaEmail(driver);
	 
		email.loginwithemail("kprabhat956@gmail.com");
			
	}
	
}
	
	


