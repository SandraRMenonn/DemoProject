package testScript;

import org.testng.annotations.Test;

import pages.ClientClick;
import pages.HomePage;
import pages.LoginPage;

public class ClientsPage extends Base{
	public HomePage homepage;
	public ClientClick clientClick;
	
  @Test
  public void verifyUserIsableToSearchClientUserNameAndId() {
	  
	  
	  LoginPage login = new LoginPage(driver);
		login.enterUsernamePassword("carol", "1q2w3e4r");
		homepage = login.clickLoginButton();
		clientClick = homepage.clientClick();
		clientClick.clientSearchAndClick("Sam", "3").clientSearchbutton();
       
  }
}