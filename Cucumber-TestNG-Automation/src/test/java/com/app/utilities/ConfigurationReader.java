package com.app.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfigurationReader {
	 public static Properties configFile;
	

	static {
		
		try {
		
		configFile = new Properties();
			FileInputStream inputStream = new FileInputStream("./configuration.properties");
			configFile.load(inputStream);
			inputStream.close();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
//		public static String getProperty(String keyName) {
//			return configFile.getProperty(keyName);
//		}
		
	

}
