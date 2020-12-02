package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtils1DataProvider {


/*	public static void main(String[] args) {

		String projectPath=System.getProperty("user.dir");
		testData(projectPath+"\\excel\\data.xlsx", "Sheet1");
	}*/
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password)
	{
	System.out.println(username+"|"+password);
	}
	
	@DataProvider(name="test1data")
	public Object getData()
	{
		String excelPath="C:\\Users\\sharia.riaz\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\excel\\data.xlsx";
		
		Object data[][]=testData(excelPath, "Sheet1");
		return data;
	}

	public static Object[][]  testData(String excelPath,String sheetName)
	{
		ExcelUtils1 excel=new ExcelUtils1(excelPath,sheetName);
		int rowCount=excel.getRowcount();
		int colCount=excel.getColumncount();
		
		Object data[][]=new Object[rowCount-1][colCount];

		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellDataString=excel.getCellDataString(i,j);
				//System.out.println(cellDataString);
				data[i-1][j]=cellDataString;
			}
		}
         return data;
	}
}
