package NEXTeTICKET_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;

public class NEXTeTICKET_HomePageLocator extends NEXTeTICKET_Base {
	public NEXTeTICKET_HomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[2]/section[13]/div/div/div/div[2]/div/h2")
	public WebElement subscribetonewsletter;
	@FindBy(id="form-field-email")
	public WebElement nextemail;
	@FindBy(xpath ="//span[text()='Send']")
	public WebElement nextsend;
	@FindBy(xpath="//div[@class='elementor-message elementor-message-success']")
	public WebElement nextsuccess;
	@FindBy(xpath ="")
	public WebElement nexts;
}
