package eBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import eBanking.pageObjects.LoginPage;

public class Login_TC01 extends BaseClass {

	@Test
	public void loginTest() throws IOException{
		driver.get(baseUrl);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is entered");
		
		lp.setPassword(password);
		logger.info("password is entered");
		
		lp.clickSubmit();
		logger.info("Clicked submit button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		
	}
	
	
}
