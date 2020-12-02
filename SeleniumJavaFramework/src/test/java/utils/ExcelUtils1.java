package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils1 {


	static String projectPath; 
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public ExcelUtils1(String excelPath,String sheetName)
	{
		try {

			workbook=new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetName);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
	}
	public static int getRowcount()
	{
		int rowCount=0;

		try {


			rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows :"+rowCount);

		} 

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return rowCount;
	}


	public static int getColumncount()
	{
		int colCount=0;

		try {


			colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of rows :"+colCount);

		} 

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
	return colCount;

	}
	
	public static String getCellDataString(int rowNum,int colNum)
	{
		String cellDataString=null;
		try {
			
			cellDataString=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//	System.out.println(cellDataString);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return cellDataString;

	}
 
/*	public static void getCellDataNumber(int rowNum,int colNum)
	{
		try {
			
			double cellDataNumber=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellDataNumber);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}*/
}

