package com.linkcxo.testscript;

import java.io.IOException;
import java.text.ParseException;

import org.testng.annotations.Test;
import com.linkcxo.pages.LoginPageViaEmail;
import com.linkcxo.utils.ConfigReader;
import com.linkcxo.utils.ExcelReader;
import com.linkcxo.utils.JsonReader;

public class BaseTest extends com.linkcxo.appiumsetup.AppiumBasePageSetup {
      LoginPageViaEmail email;
	
	
	@Test
	public void linkcxo() throws IOException, ParseException, org.json.simple.parser.ParseException, InterruptedException {
//		JsonReader json=new JsonReader();
//		String EMAIL1=json.gettestvalue("EMAIL");
	ConfigReader con=new ConfigReader();
//		ExcelReader excel=new ExcelReader();
//		excel.getexcelvalue()
		
		email=new LoginPageViaEmail(driver);
	 
		email.loginwithemail(con.getconfigvalue());
	}
	
}
	
	

