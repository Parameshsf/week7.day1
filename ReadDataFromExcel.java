package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static String[][] readDataFromExcel(String fileName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook(
				"D:\\Selenium\\Workplace\\PageObjectModel\\src\\test\\java\\utils\\"+fileName+".xlsx");
		// Create object to get in to worksheet
		XSSFSheet ws = wb.getSheet("sheet1");
		// Get the row count
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		// Get the cell count
		int cellCount = ws.getRow(0).getLastCellNum();
		String readData[][] = new String[rowCount][cellCount];
		// Iterate through for loop to print all the data from the worksheet
		System.out.println("The data from the Create Lead Worksheet as follows:");
		for (int i = 1; i <= rowCount; i++) {

			for (int j = 0; j < cellCount; j++) {
				String data = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				readData[i - 1][j] = data;

			}

		}

		wb.close();
		return readData;
	}

}
