package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	Logger logger = Logger.getLogger(this.getClass()); 
	GetProperties read=new GetProperties();

	public String screenshot(WebDriver driver,String name) 
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String fileName= read.getScreenShotPath()+"\\"+name+"-"+timeStamp+".png";
		
		// Driver will capture screenshot of current page and store it in File variable scrFile
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		try
		{
			//Copying image from scrFile to other file in a specified path
			FileUtils.copyFile(scrFile, new File(fileName)); 
			logger.error("Screenshot is captured and saved in src/customTestOutput/FailedCase_ScreenShots");
		} 
		
		catch (Exception e)
		{
			logger.error("Unable to take screenshot");
			e.printStackTrace();
		}
		return fileName;
	}
	
}
