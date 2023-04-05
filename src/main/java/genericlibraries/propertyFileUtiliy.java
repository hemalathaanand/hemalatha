package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyFileUtiliy {
	
	public void fetchPropertyConfing(String filePath) {
		FileInputStream fis =null;
		try {
			fis = new FileInputStream(filePath);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		Properties property = new Properties();
		try {
			property.load(fis);
		}catch (IOException e){
			e.printStackTrace();
			
		}
	return property.getProperty(key);
	
	}
		
	