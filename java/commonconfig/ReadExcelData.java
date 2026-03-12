package commonconfig;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readData(String filename) throws IOException {
	//public static void main(String[] args) throws IOException {
		// open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");
        // open the worksheet
		
		//XSSFSheet ws = wb.getSheet("Sheet1"); // locating the element
		XSSFSheet ws = wb.getSheetAt(0);
		
		// count the number of rows
		// count the no of columns
		// retrive the entrie data
		
		// count the no of rows - it will return the row count  will exclude first row in the table
		int rowCount = ws.getLastRowNum();
		System.out.println("RowCount is :" +rowCount);
		
		//count the no of rows - including the first row of the table
		int entireRow = ws.getPhysicalNumberOfRows();
		System.out.println("EntireRow is :" +entireRow);
		
		// count the no of columns
		int columCount = ws.getRow(0).getLastCellNum();
		System.out.println("column count is "+columCount);
		
		// to retrive  single data
	String singleCell = 	ws.getRow(1).getCell(1).getStringCellValue();
	System.out.println("Single cell value is :" +singleCell);
	
	String[][] data = new String[rowCount][columCount];	// directly we are passing variable name instead of index value
	
	// to retrive entire data availble in the row/ colum
	for(int i=1;i<=rowCount;i++) 
	{
		XSSFRow row =ws.getRow(i);
		
		// 	XSSFRow row =ws.getRow(0);
		//XSSFRow row =ws.getRow(1);
		
		for(int j=0;j<columCount;j++) 
		{
			String allData = row.getCell(j).getStringCellValue();
			System.out.println("the data is :" +allData);
			
			// row.getCell(0).getStringCellValue();
			//row.getCell(1).getStringCellValue();
			//row.getCell(2).getStringCellValue(); looping continues till j value complete then focus move to i means row again

			data[i-1][j]= allData;
			
			// data[0][0]= qeagle
			// data[0][1]=tcs
			
		}
	}
	return data;
	
	
	}

	
	}


