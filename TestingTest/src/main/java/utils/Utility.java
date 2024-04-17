package utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void captureScreenshot (WebDriver driver, int testID) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String d1 = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());
		File dest = new File ("test-output\\screenshot\\Test-"+"_"+d1+".jpg");
		FileHandler.copy(source, dest);
	}

	public static String getDataFromExcelSheet(String sheet , int row, int column) throws  IOException
	{
		String data;
		
		String path = "src\\main\\resources\\Data\\registerdata.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		try {
			Sheet s= book.getSheet("sheet");
			Row r = s.getRow(row);
			Cell c = r.getCell(column);
			data = c.getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value = book.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue();
			data = Double.toString(value);
		}
		
		return data;
		
	}
}


