package POMTest;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMClass.ApplicationHeader;
import POMClass.ParaBankLoginClass;
import browser.Base;
import utils.Utility;
public class TestNGCases {

	
	WebDriver driver;
	ParaBankLoginClass login;
	ApplicationHeader applicationHeader;
	int testID;
	String sheet;
	int j;

	
	@BeforeTest
	public void launchBrowsers() {
		Base.openChromeBrowser();
		}
	@BeforeClass
public void beforeClass()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver(); 
				
	}
	@BeforeMethod
	public void beforemethod()
	{
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
 		driver.manage().window().maximize();
 		
 		login = new ParaBankLoginClass(driver);
 		
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
 		
 		 applicationHeader = new ApplicationHeader(driver);

	}
	@Test
	public void test() throws IOException
	{
//		applicationHeader.clickoncontact();
// 		
// 		String url = driver.getCurrentUrl();
// 		String title = driver.getTitle();
// 		
// 		if(url.equals("https://parabank.parasoft.com/parabank/contact.htm") && title.equals("ParaBank | Customer Care"))
// 		{
// 			System.out.println("Passed123");
// 		}
// 		else
// 		{
// 			System.out.println("Failed789");
		
		
//		for(int i= 1; i<=11; i++) {
//			String data = Utility.getDataFromExcelSheet("sheet", 1, i);
//			j=i+1;
//			reg.registerall(data);
// 		}
 		
	}
	@AfterMethod
	public void aftermethod()
	{
//		if(ITestResult.FAILURE == result.getStatus()) {
//			Utility.captureScreenshot(driver, testID);
//		}
//		System.out.println("d");
		applicationHeader.clickonlogout();	
	}
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}

}
	

