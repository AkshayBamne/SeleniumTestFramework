package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();

	}
	
	public static void getProperties() {
		
		try {
			
			//Properties object
			Properties prop=new Properties();
			//to make sure absoluate location will not break whe project moved to other machine
			String projectPath=System.getProperty("user.dir");
			//Input stream to read from properties file
			//InputStream input= new FileInputStream("C:\\Users\\akkibamne\\git\\SeleniumTestFramework\\SeleniumTestFramework\\src\\test\\java\\config\\config.properties");
			
			InputStream input= new FileInputStream(projectPath+"/src/test/java/config/config.properties");
		//load properties file
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
			//get values from properties file 
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
			System.out.print(e.getCause());
			e.printStackTrace();
		}

	}
	//method to set the data in properties file 
	public static void setProperties() {
		
		try {
			Properties prop=new Properties();
			String projectPath=System.getProperty("user.dir");
			OutputStream output=new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "firefox");
			prop.store(output, null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	
}
