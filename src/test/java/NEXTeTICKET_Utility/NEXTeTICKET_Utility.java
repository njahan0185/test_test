package NEXTeTICKET_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class NEXTeTICKET_Utility extends NEXTeTICKET_Base{
	
	public static long pageLoadTimeout= 50;
	public static long implicitlyWait= 50;
public static void takeMyScreenshot(WebDriver driver, String screenshot) {
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String correntdir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(srcfile, new File(correntdir+"/NEXTeTICKET_Screenshots/"+screenshot+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
