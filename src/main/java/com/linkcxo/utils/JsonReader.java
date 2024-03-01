package com.linkcxo.utils;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReader {
	
	 
	public JSONObject getjsonvalue() throws IOException, ParseException, org.json.simple.parser.ParseException  {
	       
        //pass the path of the testdata.json file
        File filename = new File("C:\\Users\\rahul\\eclipse-workspace\\LinkCxoAndroidAppVersion2Framework\\Resources\\TestData\\dataset.json");
       
        String json = FileUtils.readFileToString(filename, "UTF-8");
        //parse the string into object
        Object obj = new JSONParser().parse(json);
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
}

public String gettestvalue(String key) throws IOException, ParseException, org.json.simple.parser.ParseException {
	return (String) getjsonvalue().get(key);
	
   
    }
}
