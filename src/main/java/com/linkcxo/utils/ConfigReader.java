package com.linkcxo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public String getconfigvalue() throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\LinkCxoAndroidAppVersion2Framework\\Resources\\Config\\config.properties");
		Properties propt=new Properties();
		propt.load(file);
		String Email=propt.getProperty("EMAIL1");
		return Email;
		
	}
public String getconfigotp() throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\LinkCxoAndroidAppVersion2Framework\\Resources\\Config\\config.properties");
		Properties propt=new Properties();
		propt.load(file);
		String Otp=propt.getProperty("OTP");
		return Otp;
		
	}
	
	

}
