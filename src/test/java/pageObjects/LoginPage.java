package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpwd;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnlogin;
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPwd(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	public void clicklogin() {
		btnlogin.click();
	}
}
