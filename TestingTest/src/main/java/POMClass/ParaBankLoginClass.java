package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParaBankLoginClass {


	@FindBy(xpath = "//input[@id='customer.firstName']")
	private WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='customer.lastName']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='customer.address.street']")
	private WebElement Address;
	
	@FindBy(xpath = "//input[@id='customer.address.city']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@id='customer.address.state']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	private WebElement zipCode;
	
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	private WebElement PhoneNumber;
	
	@FindBy(xpath = "//input[@id='customer.ssn']")
	private WebElement ssn;
	
	@FindBy(xpath = "//input[@id='customer.username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='customer.password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='repeatedPassword']")
	private WebElement confirmedpassword;
	
//	@FindBy (xpath = "//input[@value='Register']")
//	private WebElement Register;
//	
//	@FindBy(xpath = "(//input[@type='submit'])[2]")
//	private WebElement submit;
//	
  
	@FindBy(xpath = "//input[@type = 'submit']")
	private WebElement Register;
	
	@FindBy (xpath = "//a[text()='Register']")
	private WebElement Registertab;
	
	@FindBy (xpath = "//input[@class='input'and @type='text'])[j]")
	private WebElement Registerall;
	
	
    public ParaBankLoginClass (WebDriver driver2) // driver2 = driver = new Chromedriver()
    {
    	PageFactory.initElements(driver2, this);	
    }
     
//    public void Registerpage()
//    {
//    	FirstName.sendKeys("Rishikesh");
//    	lastName.sendKeys("Devade");
//    	Address.sendKeys("Malegaon");
//    	city.sendKeys("Baramati");
//    	state.sendKeys("Maharashtra");
//    	zipCode.sendKeys("413116");
//    	PhoneNumber.sendKeys("9168773517");
//    	ssn.sendKeys("abcd");
//    	username.sendKeys("Rishikesh");
//    	password.sendKeys("Rishid@2312");
//    	confirmedpassword.sendKeys("Rishid@2312");
//    	Register.click();
//    }
//}
   
    
    public void sendUserName() {
    	FirstName.sendKeys("Rishikesh1");
    }
    public void sendUserlastname() {
    	lastName.sendKeys("Devade");
    }
    public void sendAdd() {
    	Address.sendKeys("Malegaon");
    }
        public void sendCity() {
        	  city.sendKeys("Baramati");     
        }
        public void sendstate() {
        	  state.sendKeys("Maharashtra");     
        }
        public void sendzipCode() {
        	  zipCode.sendKeys("Rishid@2312");     
        }
 
        public void sendphone() {
    	  PhoneNumber.sendKeys("7278700707");     
    }
      public void sendssn() {
    	  ssn.sendKeys("abcde");     
    }
      public void senduser() {
    	  username.sendKeys("Rishikesh1");     
    }  
      public void sendpass() {
  	  password.sendKeys("Rishid@2312");     
  }
    public void sendconfpass() {
  	  confirmedpassword.sendKeys("Rishid@2312");     
  }
    public void sendRegister() {
    	  Register.click();
    	  
   }  	  
}





//USER NAME : admin
//PASSWORD : manager
