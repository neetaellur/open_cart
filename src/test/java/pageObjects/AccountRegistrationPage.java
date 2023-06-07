package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="firstname")
	WebElement txtfirstname;
	@FindBy(name="lastname")
	WebElement txtLastname;
	@FindBy(name="email")
	WebElement txtemail;
	@FindBy(name="telephone")
	WebElement txttelephone;
	@FindBy(name="password")
	WebElement txtpassword;
	@FindBy(name="confirm")
	WebElement txtconfirmpassword;
	@FindBy(name="agree")
	WebElement ckdpolicy;
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btncontinue;
	
    

}
