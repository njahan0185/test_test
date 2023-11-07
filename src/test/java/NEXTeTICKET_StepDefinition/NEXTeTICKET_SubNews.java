package NEXTeTICKET_StepDefinition;
import NEXTeTICKET_PageAction.NEXTeTICKET_HomePageAction;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NEXTeTICKET_SubNews extends NEXTeTICKET_Base {
	NEXTeTICKET_HomePageAction nexteticket_SubscriptionPageAction = new NEXTeTICKET_HomePageAction();
	
	@Given("^Launch <\"([^\"]*)\"> Next$")
	public void launch_Next(String URL) throws Throwable {
	    NextLaunchURL(URL);
	}
	@Then("^Scroll down till Subscribe To Newsletter$")
	 public void scroll_down_till_Subscribe_To_Newsletter() throws Throwable {
		nexteticket_SubscriptionPageAction.ScrolldowntillSubscribeToNewsletter();
	}
	@Then("^Verify Subscribe To Newsletterr displayed in the HomePage$")
	public void verify_Subscribe_To_Newsletterr_displayed_in_the_HomePage() throws Throwable {
		nexteticket_SubscriptionPageAction.VerifySubscribeToNewsletterrdisplayedintheHomePage(); 
	}

	@Then("^Verify Email field is displaying under Subscribe to Newsletter$")
	public void verify_Email_field_is_displaying_under_Subscribe_to_Newsletter() throws Throwable {
		nexteticket_SubscriptionPageAction.VerifyEmailfieldisdisplayingunderSubscribetoNewsletter();   
	}
	@Then("^Verify Send button is displaying under Subscribe to Newsletter$")
	public void verify_Send_button_is_displaying_under_Subscribe_to_Newsletter() throws Throwable {
		nexteticket_SubscriptionPageAction.VerifySendbuttonisdisplayingunderSubscribetoNewsletter();   
		}
	@Then("^Scroll down on HomePage and enter email and click send$")
	public void scroll_down_on_HomePage_and_enter_email_and_click_send() throws Throwable {
		nexteticket_SubscriptionPageAction.ScrolldownonHomePageandenteremailandclicksend(Nextpro.getProperty("Nextemail"));
	}
	
	@Then("^Verify Your submission was successful this message appears when sent email$")
	public void verify_Your_submission_was_successful_this_message_appears_when_sent_email() throws Throwable {
		nexteticket_SubscriptionPageAction.VerifyYoursubmissionwassuccessfulthismessageappearswhensentemail();	
	}
	@Then("^Click send button without entering the email$")
	public void click_send_button_without_entering_the_email() throws Throwable {
		nexteticket_SubscriptionPageAction.Clicksendbuttonwithoutenteringtheemail();
	    
	}

	@Then("^Verify Please fill out this field this Error messages appears when sent without email$")
	public void verify_Please_fill_out_this_field_this_Error_messages_appears_when_sent_without_email() throws Throwable {
	  
		nexteticket_SubscriptionPageAction.VerifyPleasefilloutthisfieldthisErrormessagesappearswhensentwithoutemail();
	}

}