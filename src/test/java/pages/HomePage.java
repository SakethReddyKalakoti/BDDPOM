package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy( className= "user-display")
	WebElement userLogged;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactLink;
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	//Action
	public boolean isUserLoggedIn() {
		return userLogged.isDisplayed();
	}
	public void contactPageTest() {
		contactLink.click();
	}
}
