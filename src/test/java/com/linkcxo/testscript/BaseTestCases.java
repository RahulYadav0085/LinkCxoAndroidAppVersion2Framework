package com.linkcxo.testscript;

import java.io.IOException;
import org.testng.annotations.Test;

import com.linkcxo.appiumsetup.AppiumBasePageSetup;
import com.linkcxo.signup.module.LoginPageViaEmail;
import com.linkcxo.signup.module.SignupPageViaEmail;
import com.linkcxo.utils.ConfigReader;

public class BaseTestCases extends AppiumBasePageSetup  {

	
	LoginPageViaEmail email;
    SignupPageViaEmail sign;
	
	@Test
	public void run() throws InterruptedException, IOException {
		
		email =new  LoginPageViaEmail(driver);
	     sign=new SignupPageViaEmail(driver);
	     ConfigReader con=new ConfigReader();
	     
	     email.loginwithemail(con.getconfigvalue());
			email.otpmethod(con.getconfigotp());
			sign.signupwithemail();
		
	}
	

}
