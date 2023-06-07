package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass  {
	@Test
	public void test_account_Registration() {
		logger.info("***starting TC_001_AccountRegistrationTest***");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on myaccount link");
		hp.clickRegister();
		logger.info("clicked on Registration link");
		
		
	}

}
