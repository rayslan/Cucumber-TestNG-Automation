package com.app.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	
	public static void main(String[] args) throws Exception {
	
		
		String testDataPath = "./src/test/resources/data/Employees.xlsx";
		
		FileInputStream inputStream = new FileInputStream(testDataPath);
		
		Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet worksheet = workbook.getSheet("Sheet1");
		
		Cell RuslanJob = worksheet.getRow(4).getCell(0);
		
		RuslanJob.setCellValue("Ruslan");
		
		FileOutputStream outputStream = new FileOutputStream(testDataPath);
		workbook.write(outputStream);
		
		workbook.close();
		inputStream.close();
		outputStream.close();
		
	}

}
