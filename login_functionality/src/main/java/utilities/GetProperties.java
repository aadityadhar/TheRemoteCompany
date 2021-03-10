package utilities;

import java.io.BufferedReader;
import java.util.Random; 
import java.io.FileReader;
import java.util.Properties;


public class GetProperties {

	private Properties properties;
	private final String propertyFilePath= System.getProperty("user.dir")+"\\src\\main\\java\\resources\\configFiles\\Configuration.properties";
 
	public GetProperties()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			properties.load(reader);
			reader.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public String getURL()
	{
		return properties.getProperty("url");
	}
	
	public String getBrowser()
	{
		return properties.getProperty("browser");
	}
	
	public String getEmail()
	{
		Random rand=new Random();
		return rand.nextInt()+properties.getProperty("email");
	}
	
	public String getPassword()
	{
		return properties.getProperty("password");
	}
	
	public String getCompany()
	{
		return properties.getProperty("company");
	}
	
	public String getEmailSignUp()
	{
		return properties.getProperty("emailSignUp");
	}
	
	public String getPasswordSignUp()
	{
		return properties.getProperty("passwordSignUp");
	}

	public String getChromeDriverPath()
	{
		return System.getProperty("user.dir")+properties.getProperty("chromeDriverPath");
	}
	
	public String getFirefoxDriverPath()
	{
		return System.getProperty("user.dir")+properties.getProperty("firefoxDriverPath");
	}
	
	public String getExtentReportPath()
	{
		return System.getProperty("user.dir")+properties.getProperty("extentReportPath");
	}
	
	public String getExtentConfigPath()
	{
		return System.getProperty("user.dir")+properties.getProperty("extentConfigPath");
	}
	
	public int getTimeOut()
	{
		return Integer.parseInt(properties.getProperty("timeOut"));
	}
	
	public String getTestDataPath()
	{
		
		return System.getProperty("user.dir")+properties.getProperty("testDataPath");	
	}
	
	public String getScreenShotPath()
	{
		return System.getProperty("user.dir")+properties.getProperty("screenShotPath");
	}
	
	public String getlog4jPath()
	{
		return System.getProperty("user.dir")+properties.getProperty("log4jPath");
	}
	

	
}
