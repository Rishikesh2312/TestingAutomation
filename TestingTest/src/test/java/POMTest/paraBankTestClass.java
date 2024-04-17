package POMTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClass.ApplicationHeader;
import  POMClass.LogIn;
import  POMClass.ParaBankLoginClass;


public class paraBankTestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
 		driver.manage().window().maximize();
 		
 		ParaBankLoginClass login = new ParaBankLoginClass(driver);
 		
 		login.sendUserName();
 		login.sendUserlastname();
 		login.sendAdd();
 		login.sendCity();
 		login.sendstate();
 		login.sendzipCode();
 		login.sendphone();
 		login.sendssn();
 		login.senduser();
 		login.sendpass();
 		login.sendconfpass();
 		login.sendRegister();
 		
 		ApplicationHeader applicationHeader = new ApplicationHeader(driver);
 		applicationHeader.clickoncontact();
 		
 		String url = driver.getCurrentUrl();
 		String title = driver.getTitle();
 		
 		if(url.equals("https://parabank.parasoft.com/parabank/contact.htm") && title.equals("ParaBank | Customer Care"))
 		{
 			System.out.println("Passed123");
 		}
 		else
 		{
 			System.out.println("Failed789");
 		}
 		
 	//	Thread.sleep(10000);
 	//applicationHeader.clickonlogout();
 	
 	Thread.sleep(15000);
 		driver.close();
 		
 		
 		
// 	//	2nd case
// 		
// 		
// 		driver.get("https://parabank.parasoft.com/parabank/register.htm");
//        
// 		login = new ParaBankLoginClass(driver);
// 		
// 		login.sendUserName();
// 		login.sendUserlastname();
// 		login.sendAdd();
// 		login.sendCity();
// 		login.sendstate();
// 		login.sendzipCode();
// 		login.sendphone();
// 		login.sendssn();
// 		login.senduser();
// 		login.sendpass();
// 		login.sendconfpass();
// 		login.sendRegister();
// 		
// 		 applicationHeader = new ApplicationHeader(driver);
// 		applicationHeader.clickoncontact();
// 		
// 	 	applicationHeader.clickonlogout();
//
// 		driver.close();
	}

}

