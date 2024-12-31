package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTestCase extends Base {
	
	
  @Test
  public void verifyuserisableToLoginValidCredentials() {
	  
	   
	  LoginPage login =  new LoginPage(driver);
	  login.enterUsernamePassword("carol", "1q2w3e4r");  
	  login.clickLoginButton();
	  boolean isHomepageisLoaded = login.isDashboardLoaded();
	  assertTrue(isHomepageisLoaded,"Dashboard not loaded");
	  
  }
}
