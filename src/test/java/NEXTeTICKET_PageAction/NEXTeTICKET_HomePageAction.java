package NEXTeTICKET_PageAction;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import NEXTeTICKET_PageLocator.NEXTeTICKET_HomePageLocator;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import NEXTeTICKET_Utility.NEXTeTICKET_Utility;

public class NEXTeTICKET_HomePageAction extends NEXTeTICKET_Base {
	NEXTeTICKET_HomePageLocator nexteticket_SubscriptionPageLocator = new NEXTeTICKET_HomePageLocator();
	public void ScrolldowntillSubscribeToNewsletter() throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("scroll(0,9300)");
	}
public void VerifySubscribeToNewsletterrdisplayedintheHomePage() throws InterruptedException {
	Thread.sleep(3000);
	boolean newsletter= nexteticket_SubscriptionPageLocator.subscribetonewsletter.isDisplayed();
	Thread.sleep(3000);
	Assert.assertTrue(newsletter);	
	}
public void VerifyEmailfieldisdisplayingunderSubscribetoNewsletter() throws InterruptedException {
	Thread.sleep(3000);
	boolean verifyemail= nexteticket_SubscriptionPageLocator.nextemail.isDisplayed();
	Thread.sleep(3000);
	Assert.assertTrue(verifyemail);	
   }
	public void VerifySendbuttonisdisplayingunderSubscribetoNewsletter() throws InterruptedException {
		Thread.sleep(3000);
		boolean verifyemail= nexteticket_SubscriptionPageLocator.nextsend.isDisplayed();
		Thread.sleep(3000);
		Assert.assertTrue(verifyemail);		
	}
public void ScrolldownonHomePageandenteremailandclicksend(String p) throws InterruptedException {

	((JavascriptExecutor)driver).executeScript("scroll(0,9300)");
	Thread.sleep(3000);
	nexteticket_SubscriptionPageLocator.nextemail.sendKeys(p);
	Thread.sleep(3000);
	nexteticket_SubscriptionPageLocator.nextsend.click();
	}
public void VerifyYoursubmissionwassuccessfulthismessageappearswhensentemail() throws InterruptedException {
	Thread.sleep(3000);
	boolean success= nexteticket_SubscriptionPageLocator.nextsuccess.isDisplayed();
	Thread.sleep(3000);
	Assert.assertTrue(success);
	NEXTeTICKET_Utility.takeMyScreenshot(driver, "succesmessage");
	}
public void Clicksendbuttonwithoutenteringtheemail() throws InterruptedException {
	Thread.sleep(1000);
	nexteticket_SubscriptionPageLocator.nextsend.click();
	}
public void VerifyPleasefilloutthisfieldthisErrormessagesappearswhensentwithoutemail() throws InterruptedException {
	boolean error= nexteticket_SubscriptionPageLocator.nextsend.isDisplayed();
	Assert.assertTrue(error);
	Thread.sleep(3000);
	NEXTeTICKET_Utility.takeMyScreenshot(driver, "errormessage");
	Thread.sleep(3000);

}
}

