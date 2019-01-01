package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class DataFile extends BaseClass{
	
	public DataFile(WebDriver driver) {
		super(driver);
	}

	public void openExcelFile()throws Exception { 
		try {
	      File file = new File("E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\src\\test\\java\\TestData\\ExcelData.xlsx");
	      FileInputStream fis = new FileInputStream(file);
	      
	      //Get the workbook instance for XLSX file 
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      
	      if(file.isFile() && file.exists()) {
	         System.out.println("Data.xlsx file open successfully.");
	      } else {
	         System.out.println("Error to open Data.xlsx file.");
	      }
	      fis.close();
	      }
	      catch(Exception e) {
	    	  e.printStackTrace();
	         }
	   }

	public String readTextInput(String sheetName, int RowNum, int ColNum)throws Exception {
		
		  File file = new File("E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\src\\test\\java\\TestData\\ExcelData.xlsx");
	      FileInputStream fis = new FileInputStream(file);
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
	      XSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);	
	      
	      if(cell == null)
	        {
	            System.out.println("finding cell in sheet is null ");
	        }
	        else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
	        {
	            System.out.println("finding text is number ");
	        }
	        DataFormatter dataFormatter = new DataFormatter();
	        String cellData = dataFormatter.formatCellValue(cell);
			return cellData;
	}
	
	public double readNumberInput(String sheetName, int RowNum, int ColNum)throws Exception {
		
		  File file = new File("E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\src\\test\\java\\TestData\\ExcelData.xlsx");
	      FileInputStream fis = new FileInputStream(file);
	      
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
	      XSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);
	      
	      if(cell == null)
	        {
	            System.out.println("finding cell in sheet is null ");
	        }
	        else if(cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
	        {
	            System.out.println("finding number is text ");
	        }  
	      
			double cellData = cell.getNumericCellValue();
			return cellData;
	}
}
