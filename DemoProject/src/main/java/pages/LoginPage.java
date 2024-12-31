package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) //Constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement usernameField;
	@FindBy(xpath="//input[@id='loginform-password']")
	WebElement passwordField;
	@FindBy(xpath="//button[@name='login-button']")
	WebElement loginButton;
	@FindBy(xpath="//a[text()='Workers']")
	WebElement dashboard;

public LoginPage enterUsernamePassword(String username,String password)
{
	usernameField.sendKeys(username);
	passwordField.sendKeys(password);
	return this;
}
public HomePage clickLoginButton()
{
	loginButton.click();
	return new HomePage(driver);
}

public boolean isDashboardLoaded() //To check the dashboard is visible or not
{
	return dashboard.isDisplayed();
}
}

