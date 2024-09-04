 package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configreader {
	
	
	public static Properties initializeproperties() {
		
	
	Properties property = new Properties();
	
	File fle = new File(System.getProperty("user.dir")+"src\\test\\source\\configproperty\\config.property");
	
	try {
		
		FileInputStream filis = new FileInputStream(fle);
		
		property.load(filis);
		
	}
		
		catch(Throwable e) {
			
			e.printStackTrace();
			
			
		}
		
		return property;
		
		
		
		
	}
	
	
	
	
	

}
