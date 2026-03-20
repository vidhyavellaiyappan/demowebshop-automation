package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getLoginData() throws IOException {
		// TODO Auto-generated method stub
		String fileLocation="./test-data/DemoWebShopLoginData.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(fileLocation); 
		XSSFSheet sheet = wbook.getSheetAt(0);  
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] data=new String[lastRowNum][lastCellNum];
for (int i = 1; i <= lastRowNum; i++) {
	XSSFRow row = sheet.getRow(i);
	for (int j = 0; j <lastCellNum ; j++) {
		XSSFCell cell = row.getCell(j);
		DataFormatter dft=new DataFormatter();
		String value = dft.formatCellValue(cell);
		/*
		 * //String value = cell.getStringCellValue(); System.out.println(value);
		 */	
		data[i-1][j]=value;
		} 
}
wbook.close();
return data;
	}

}
