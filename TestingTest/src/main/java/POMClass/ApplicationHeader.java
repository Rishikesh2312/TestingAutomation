package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {

	@FindBy(xpath ="//li[@class='Solutions']")
	private WebElement solution;
	
	@FindBy(xpath = "//li[@class='aboutus']")
	private WebElement aboutus;
	
	@FindBy(xpath = "//li[@class='contact']")
	private WebElement contact;
	
	  @FindBy(xpath = " //a[text()='Log Out']")
	    private WebElement Logout;

	  public ApplicationHeader (WebDriver driver) {
		  
		  PageFactory.initElements(driver, this);
	  }
	  public void clickonsolutionTab() {
		  solution.click();
	  }
	  public void clickonabout() {
		  aboutus.click();
	  }
	  public void clickoncontact() {
		  contact.click();
	  }
	  public void clickonlogout() {
		  Logout.click();
	  }
}
