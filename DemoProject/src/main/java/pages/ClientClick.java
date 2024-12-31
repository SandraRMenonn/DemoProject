package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientClick {
	
	public WebDriver driver;
	
	
	public ClientClick(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='clientsearch-client_name']")
	WebElement clientName;
	@FindBy(xpath="//input[@id='clientsearch-id']")
	WebElement clientId;
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
	
	
public ClientClick clientSearchAndClick(String name,String id)
{
	
	clientName.sendKeys(name);
	clientId.sendKeys(id);
	return this;
}
public ClientClick clientSearchbutton() {
	search.click();
	return this;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
