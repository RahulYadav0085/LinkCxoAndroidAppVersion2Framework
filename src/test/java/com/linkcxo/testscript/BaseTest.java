package com.linkcxo.testscript;

import java.io.IOException;
import java.text.ParseException;

import org.testng.annotations.Test;

import com.linkcxo.appiumsetup.TakeScreenShort;
import com.linkcxo.signup.module.LoginPageViaEmail;
import com.linkcxo.signup.module.SignupPageViaEmail;
import com.linkcxo.utils.ConfigReader;
import com.linkcxo.utils.ExcelReader;
import com.linkcxo.utils.JsonReader;

public class BaseTest extends com.linkcxo.appiumsetup.AppiumBasePageSetup {
      LoginPageViaEmail email;
      SignupPageViaEmail sign;
	
	
	@Test
	public void linkcxo() throws IOException, ParseException, org.json.simple.parser.ParseException, InterruptedException {
//		JsonReader json=new JsonReader();
//		String EMAIL1=json.gettestvalue("EMAIL");
	ConfigReader con=new ConfigReader();

	try{
	  sign =new SignupPageViaEmail(driver);
		email=new LoginPageViaEmail(driver);
	 
		email.loginwithemail(con.getconfigvalue());
		email.otpmethod(con.getconfigvalue());
		sign.signupwithemail();
		
	
	}catch(Exception e) {
		TakeScreenShort image=new TakeScreenShort();
		image.takeScreenshot(driver, "ERROR");
		throw e;
	}
	}
		
	}
	

	
	


