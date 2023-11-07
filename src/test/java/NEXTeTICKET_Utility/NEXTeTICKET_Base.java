package NEXTeTICKET_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class NEXTeTICKET_Base {
	public static WebDriver driver;
	public static Properties Nextpro;
	public NEXTeTICKET_Base() {
		try {
			FileInputStream nextfile = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//NEXTeTICKET_Config//NEXTeTICKET_Config.Properties"));
Nextpro= new Properties();
Nextpro.load(nextfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Please, look the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Nextbrowser () {
		String Nextallbrowser=Nextpro.getProperty("NextBrowser1");
		if(Nextallbrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//NEXTeTICKET_ChromeDriver//chrome.exe"));
			ChromeOptions obj = new ChromeOptions();
			obj.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(NEXTeTICKET_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(NEXTeTICKET_Utility.implicitlyWait));
			driver.manage().window().maximize();
			
	}
		else if(Nextallbrowser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//NEXTeTICKET_EdgeDriver//msedgedriver.exe"));
			EdgeOptions objee = new EdgeOptions();
			objee.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(NEXTeTICKET_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(NEXTeTICKET_Utility.implicitlyWait));
			driver.manage().window().maximize();
		}
		
	}
	
	public static void NextLaunchURL(String URL) {
		driver.get(Nextpro.getProperty("NextURL"));	
	}		
	}
