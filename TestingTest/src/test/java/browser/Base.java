package browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

    public static  WebDriver openChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		return driver ;
		
	}
	
	public static WebDriver openFireFoxBrowser() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.34.0-win-aarch64");
		
		WebDriver driver = new FirefoxDriver();
		
		return driver ;
	}
	
	public static WebDriver openOperaBrowser() {
		
		System.setProperty("webdriver.opera.driver","C:\\Drivers\\operadriver_win64\\operadriver_win64");
		
		WebDriver driver = new OperaDriver();
		
		return driver ;
	}

}

