package Helpers.Utils.propertiesreading;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.io.File;
public class readproperties {
	 
	public String readprops(String Gerprop) throws IOException { 
		 	
			String localDir = System.getProperty("user.dir");
		 	File file = new File(localDir + "\\src\\test\\resources\\data.properties");
		 	Reader output = new FileReader(file); 
            Properties prop = new Properties();
            prop.load(output);  
            String prop_value=prop.getProperty(Gerprop);
            return prop_value;

        } 
		
	
	
}
	  
	




