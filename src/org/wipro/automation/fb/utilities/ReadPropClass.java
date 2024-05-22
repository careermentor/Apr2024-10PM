package org.wipro.automation.fb.utilities;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropClass 
{

	public static String readconfg(String key) throws Exception
	{
		FileReader fr = new FileReader("./Data/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
		
		
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./Data/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
		
		
	}

	
}
