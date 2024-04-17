package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {


	@FindBy (xpath = "//input[@name='username'] ")
	private WebElement username;
	
	@FindBy ( xpath = " //input[@type='password']")
	private WebElement pass;

	@FindBy (xpath = " //input[@value='Log In']")
	private WebElement LoginTab;
	
	@FindBy (xpath ="(//a[@href='/parabank/index.htm'])[2]")
	private WebElement Home;
	
	
	
	public LogIn (WebDriver driver ) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginPage()
	{
		Home.click();
		username.sendKeys("Rishikesh");
		pass.sendKeys("Rishid@2312");
		LoginTab.click();
	}

}
