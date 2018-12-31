package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.*;
import java.io.IOException;
import java.util.Iterator;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
//	private static XSSFSheet ExcelWSheet; 
//	private static XSSFWorkbook ExcelWBook;
//	private static XSSFCell Cell;
//	private static XSSFRow Row;

	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method 
//	public static void setExcelFile(String Path,String SheetName) throws Exception {
//		try {
//   			// Open the Excel file
//			FileInputStream ExcelFile = new FileInputStream("/home/chetan/eclipse-workspace/KISANCHAT/src/test/java/TestData/Data.xlsx");
//			
//			// Access the required test data sheet
//			ExcelWBook = new XSSFWorkbook(ExcelFile);
//			ExcelWSheet = ExcelWBook.getSheet("Login");
//			} catch (Exception e){
//				throw (e);
//			}
//	}

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
    public static String getCellData(int RowNum, int ColNum) throws Exception{
			try {
				
//				// Open the Excel file
				File file = new File("E:\\KISANCHAT-25-04-2018-20181224T063325Z-001\\KISANCHAT-25-04-2018\\src\\test\\java\\TestData\\ExcelData.xlsx");
				if(file.isFile() && file.exists()) {
			         System.out.println("Data.xlsx file open successfully.");
			      } else {
			         System.out.println("Error to open Data.xlsx file.");
			      }
				
				FileInputStream ExcelFile = new FileInputStream(file);
				
				// Access the required test data sheet
				XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
				XSSFSheet ExcelWSheet = ExcelWBook.getSheet("Login");
                XSSFCell Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);			
				String CellData = Cell.getStringCellValue();
				return CellData;
				
				}catch (Exception e){
					e.printStackTrace();
				}
			return null;

    }

//	//This method is to write in the Excel cell, Row num and Col num are the parameters
//	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{
//			try{
//  			Row  = ExcelWSheet.getRow(RowNum);
//			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
//			if (Cell == null) {
//				Cell = Row.createCell(ColNum);
//				Cell.setCellValue(Result);
//				} else {
//					Cell.setCellValue(Result);
//				}
//
//  // Constant variables Test Data path and Test Data file name
//  				FileOutputStream fileOut = new FileOutputStream("/home/chetan/eclipse-workspace/KISANCHAT/src/test/java/TestData/Data.xlsx" + "data.xls");
//  				ExcelWBook.write(fileOut);
//  				fileOut.flush();
//					fileOut.close();
//				}catch(Exception e){
//					throw (e);
//			}
//		}

	
	
	
	
	
	
	
	
	
	
	
	
//	   static XSSFRow row;
//	
//   public void openExcel() throws Exception { 
//      File file = new File("/home/chetan/eclipse-workspace/KISANCHAT/src/test/java/TestData/Data.xlsx");
//      FileInputStream fIP = new FileInputStream(file);
//      
//      //Get the workbook instance for XLSX file 
//      XSSFWorkbook workbook = new XSSFWorkbook(fIP);
//      
//      if(file.isFile() && file.exists()) {
//         System.out.println("Data.xlsx file open successfully.");
//      } else {
//         System.out.println("Error to open Data.xlsx file.");
//      }
//   }
//   
//   public void writeSheet() throws Exception {
//	   File file = new File("/home/chetan/eclipse-workspace/KISANCHAT/src/test/java/TestData/Data.xlsx");
//	   FileInputStream fis = new FileInputStream(file);
//	      
//	   //Get the workbook instance for XLSX file 
//	   XSSFWorkbook workbook = new XSSFWorkbook(fis);
//	   XSSFSheet spreadsheet = workbook.createSheet("Login1");
//
//	      //Create row object
//	      XSSFRow row;
//
//	      //This data needs to be written (Object[])
//	      Map < String, Object[] > logininfo = 
//	      new TreeMap < String, Object[] >();
//	      logininfo.put( "1", new Object[] { "Mobile Number", "First Name", "Last 'Name" });
//	      logininfo.put( "2", new Object[] { "9403247980", "Chetan", "Warke" });
//	      
//	      //Iterate over data and write to sheet
//	      Set < String > keyid = logininfo.keySet();
//	      int rowid = 0;
//
//	      for (String key : keyid) {
//	         row = spreadsheet.createRow(rowid++);
//	         Object [] objectArr = logininfo.get(key);
//	         int cellid = 0;
//
//	         for (Object obj : objectArr) {
//	            Cell cell = row.createCell(cellid++);
//	            cell.setCellValue((String)obj);
//	         }
//	      }
//
//	      //Write the workbook in file system
//	      FileOutputStream out = new FileOutputStream(file);
//	      workbook.write(out);
//	      out.close();
//	      System.out.println("Writesheet.xlsx written successfully");
//	   }
//   
//   public void readSheet() throws Exception {
//	   File file = new File("/home/chetan/eclipse-workspace/KISANCHAT/src/test/java/TestData/Data.xlsx");
//	   FileInputStream fis = new FileInputStream(file);
//	      
//	   //Get the workbook instance for XLSX file 
//	   XSSFWorkbook workbook = new XSSFWorkbook(fis);
//	   
//	      XSSFSheet spreadsheet = workbook.getSheetAt(0);
//	      Iterator < Row >  rowIterator = spreadsheet.iterator();
//	      
//	      while (rowIterator.hasNext()) {
//	         row = (XSSFRow) rowIterator.next();
//	         Iterator < Cell >  cellIterator = row.cellIterator();
//	         
//	         while ( cellIterator.hasNext()) {
//	            Cell cell = cellIterator.next();
//	            
//	            switch (cell.getCellType()) {
//	               case Cell.CELL_TYPE_NUMERIC:
//	                  System.out.print(cell.getNumericCellValue() + " \t\t ");
//	                  break;
//	               
//	               case Cell.CELL_TYPE_STRING:
//	                  System.out.print(
//	                  cell.getStringCellValue() + " \t\t ");
//	                  break;
//	            }
//	         }
//	         System.out.println();
//	      }
//	      fis.close();
//   }

}
	
