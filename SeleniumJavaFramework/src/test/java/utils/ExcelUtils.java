package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	static String projectPath; 
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	
	public ExcelUtils(String excelPath,String sheetName)
	{
		try {
           
	        workbook=new XSSFWorkbook(excelPath);
	        sheet=workbook.getSheet(sheetName);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
	/*	getRowcount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);*/
		
	}
	public static void getRowcount()
	{

		try {

			
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows :"+rowCount);

		} 

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void getCellDataString(int rowNum,int colNum)
	{
		try {
			
			String cellDataString=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellDataString);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
 
	public static void getCellDataNumber(int rowNum,int colNum)
	{
		try {
			
			double cellDataNumber=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellDataNumber);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static void getColumncount()
	{

		try {

			
			int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of rows :"+colCount);

		} 

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	


}
