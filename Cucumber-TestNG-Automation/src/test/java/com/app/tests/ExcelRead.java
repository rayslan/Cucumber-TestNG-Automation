package com.app.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelRead {

	
	public static void main(String[] args) throws Throwable, IOException   {
		
		String path = "/Users/suvhanberdiatamyradov/Desktop/Employees.xlsx";
		
		FileInputStream inputStream = new FileInputStream(path);
		

		Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet worksheet = workbook.getSheetAt(0);
		Row row = worksheet.getRow(0);
		Cell cell = row.getCell(0);
		
		System.out.println(cell.toString());
		
		
		int rowCount = worksheet.getPhysicalNumberOfRows();
		
		for(int rownums=1; rownums<rowCount; rownums++) {
			
			row = worksheet.getRow(rownums);
			cell = row.getCell(0);
					
			System.out.println(rownums + "-" + cell.toString() );
			
			
			
		}
		
		System.out.println("=================================");
		
		Cell LexJob = worksheet.getRow(3).getCell(2);
		System.out.println(LexJob);
		
		
		workbook.close();
		inputStream.close();
		
	}
}
