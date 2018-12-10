package org.projet.library.webapp;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyLoader {

	public Properties getProperty() {
		
		Properties properties = new Properties();
		
		FileInputStream in = null;
		
		try {
			String propertyFile = System.getProperty("user.home") + "/" + "Bureau/library/library-webapp/resources/config.properties";
			in = new FileInputStream(propertyFile);
			properties.load(in);
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}
}