package NewPack;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	//import org.apache.poi.ss.usermodel.Row;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class seleniumGetData {

		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			
			WebElement login = driver.findElement(By.xpath("//input[@value='Register']"));
			
			Thread.sleep(2000);
			login.click();
			Thread.sleep(2000);
			
			for (int k =1 ; k<=3; k++) {
				
				for (int i= 1; i<=11; i++)  
				{
					String data = seleniumGetData.getdata("Sheet", k, i);
					int a = i+1;
					int j= a+1;
					
					WebElement registerall = driver.findElement(By.xpath("//input[@name='username'])["+j+"]"));
					registerall.sendKeys(data);
				}
			}
	  
			WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
			submit.click();
		}
		
		private static String getdata(String sheet, int row, int column) throws EncryptedDocumentException, IOException {

			String data;
			String path ="C:\\Users\\Administrator\\Desktop\\sele\\registerdata.xlsx";
			
			FileInputStream file = new FileInputStream(path);
			
			Workbook book = WorkbookFactory.create(file);
			
			try {
				data= book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
			}
			catch (IllegalStateException e)
			{
				double value = book.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue();
				data = Double.toString(value);
			}
			
			return data;
		}

	}

