package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {

public static String[][] getdata(String sheetName){
	
	String[][] testData =null;
	
	try {
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
	
	    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	    
	    XSSFSheet sheet =  workbook.getSheet(sheetName);
	      
	    int rowCount =  sheet.getLastRowNum();
	
	    int columnCount = sheet.getRow(0).getLastCellNum();
	
	    testData = new String[rowCount][columnCount];
	    
	    System.out.println("Row count "+rowCount);
	    
	    System.out.println("Column count"+columnCount);
	
	    for(int i=1; i<=rowCount; i++) {
	    	XSSFRow row =sheet.getRow(i);
	    	
	    for(int j=0; j<columnCount; j++) {
	   String cellData = row.getCell(j).getStringCellValue();
	    	
	   System.out.println("The value of row is "+i+" and value of column "+j+" is : "+cellData);
	   testData[i-1][j]= cellData;
	    }
	   }
	
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	return testData;
	
	
  }
	
}
