package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
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
//	      HSSFWorkbook workbook = new HSSFWorkbook(fis);
//	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      
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
		
		  File file = new File("E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\src\\test\\java\\TestData\\ExcelData.xls");
	      FileInputStream fis = new FileInputStream(file);
	      HSSFWorkbook workbook = new HSSFWorkbook(fis);
//	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      HSSFSheet spreadsheet = workbook.getSheet(sheetName);
//	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
	      HSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);
//	      XSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);	
	      
	      if(cell == null)
	        {
	            System.out.println("finding cell in sheet is null ");
	        }
	        else if(cell.getCellType() == CellType.NUMERIC)
	        {
	            System.out.println("finding text is number ");
	        }
	        DataFormatter dataFormatter = new DataFormatter();
	        String cellData = dataFormatter.formatCellValue(cell);
			return cellData;
	}
	
	public double readNumberInput(String sheetName, int RowNum, int ColNum)throws Exception {
		
		  File file = new File("E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\src\\test\\java\\TestData\\ExcelData.xls");
	      FileInputStream fis = new FileInputStream(file);
	      HSSFWorkbook workbook = new HSSFWorkbook(fis);
//	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      HSSFSheet spreadsheet = workbook.getSheet(sheetName);
//	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
	      HSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);
//	      XSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);	
	      
	      if(cell == null)
	        {
	            System.out.println("finding cell in sheet is null ");
	        }
	        else if(cell.getCellType() == CellType.STRING)
	        {
	            System.out.println("finding number is text ");
	        }  
	      
			double cellData = cell.getNumericCellValue();
			return cellData;
	}
	
	public void writeTextInput(String sheetName, String dataToWrite)throws Exception {
		
		  File file = new File("E:\\Chetan-Selenium\\git\\KISAN.NET_WEB_APP\\KISANCHAT-25-04-2018\\src\\test\\java\\TestData\\ExcelData.xls");
	      FileInputStream fis = new FileInputStream(file);
	      HSSFWorkbook workbook = new HSSFWorkbook(fis);
//	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      HSSFSheet spreadsheet = workbook.getSheet(sheetName);
//	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
//	      HSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);
//	      XSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);	
	     
	      //Get the current count of rows in excel file
	      int rowCount = spreadsheet.getLastRowNum()-spreadsheet.getFirstRowNum();
	     
	      //Get the first row from the sheet
	      HSSFRow row = spreadsheet.getRow(0);
	      
	      for(int i=0;i<rowCount;i++)
	      {
	    	  row.removeCell(row.getCell(0));
	      }

	      //Create a new row and append it at last of sheet
	      HSSFRow newRow = spreadsheet.createRow(rowCount+1);

//	      HSSFCell cell = newRow.createCell(0);
//	      cell.setCellValue(dataToWrite);

	      
	      //Create a loop over the cell of newly created Row
	      for(int j = 0; j < row.getLastCellNum(); j++){

	          //Fill data in row
	    	  HSSFCell cell = newRow.createCell(j);
	          cell.setCellValue(dataToWrite);

	      }

	      //Close input stream
	      fis.close();

	      //Create an object of FileOutputStream class to create write data in excel file
	      FileOutputStream outputStream = new FileOutputStream(file);

	      //write data in the excel file
	      workbook.write(outputStream);

	      //close output stream
	      outputStream.close();

	}
}
