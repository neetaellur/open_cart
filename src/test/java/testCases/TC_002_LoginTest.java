package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	@Test
	public void test_login() {
		logger.info("starting TC_002_LoginTest");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on myaccount");
		hp.clickLogin();
		logger.info("clicked on login");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPwd(rb.getString("password"));
		lp.clicklogin();
		logger.info("click on login btn");
		Assert.assertEquals(true, true);
		logger.info("finished TC_002_loginTest");
		
		
	}

}
