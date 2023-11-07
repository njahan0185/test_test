package NEXTeTICKET_TestRunner;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/nexteticket_Features"},
plugin = {"json:target/cucumber.json"},
glue = "NEXTeTICKET_StepDefinition",

//tags = {"@NexT1"})
//tags = {"@NexT2"})
//tags = {"@NexT3"})
//tags = {"@NexT4"})
tags = {"@NexT5"})



public class NEXTeTICKET_TestRunner extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void nextStartURL () {
		NEXTeTICKET_Base next = new NEXTeTICKET_Base();
		next.Nextbrowser();
		
	}

	@AfterTest
	public void nextCloseURL () {
		NEXTeTICKET_Base next = new NEXTeTICKET_Base();
		next.driver.quit();
	}
	
	
	

}
