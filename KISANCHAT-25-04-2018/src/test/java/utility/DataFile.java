package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
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
//	            System.out.println("finding text is number ");
	            DataFormatter dataFormatter = new DataFormatter();
		        String cellData = dataFormatter.formatCellValue(cell);
		        return cellData;
	    	} 
	        
//	        DataFormatter dataFormatter = new DataFormatter();
//	        String cellData = dataFormatter.formatCellValue(cell);
//			return cellData;
	      String cellData = cell.getStringCellValue();
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
//	            System.out.println("finding number is text ");
	        	 DataFormatter dataFormatter = new DataFormatter();
			     String text = dataFormatter.formatCellValue(cell);
			     double cellData = Double.parseDouble(text);
			     return cellData;
	        }
	      
			double cellData = cell.getNumericCellValue();
			return cellData;
	}
	
	public void writeTextInput(String sheetName, String dataToWrite)throws Exception {
		
		  File file = new File("E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\src\\test\\java\\TestData\\ExcelData.xlsx");
	      FileInputStream fis = new FileInputStream(file);
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
//	      //Get the current count of rows in excel file
	      int rowCount = spreadsheet.getLastRowNum()-spreadsheet.getFirstRowNum();
	     
//	      //Get the first row from the sheet
//	      XSSFRow row = spreadsheet.getRow(0);
//	      
//	      for(int i=0;i<rowCount;i++)
//	      {
//	    	  row.removeCell(row.getCell(i));
//	      }

	      //Create a new row and append it at last of sheet
	      XSSFRow newRow = spreadsheet.createRow(rowCount+1);
	      //Fill data in row
    	  XSSFCell cell = newRow.createCell(1);
          cell.setCellValue(dataToWrite);

	      fis.close();

	      //Create an object of FileOutputStream class to create write data in excel file
	      FileOutputStream outputStream = new FileOutputStream(file);

	      workbook.write(outputStream);

	      outputStream.close();

	}
}
