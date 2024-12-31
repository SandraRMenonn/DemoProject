package testScript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ClientClick;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTestcase extends Base {
	
	public HomePage homepage; //reference variable
	
	@Test
	public void verifyUserisableToLogoutScreen() {

		LoginPage login = new LoginPage(driver);
		login.enterUsernamePassword("carol", "1q2w3e4r");
		homepage=login.clickLoginButton();
		homepage.logoutUserProfile();
		
		/*login.clickOnLoginButton();
		HomePage hm = new HomePage(driver);
		hm.logoutUserProfile(); */
		
		boolean isLoginPageLoaded = homepage.isMatchTitle();
		String expectedTitle = "Login";
		assertEquals(driver.getTitle(), expectedTitle, "The page title is not correct after logout.");}}