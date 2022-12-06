package com.Actitime.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import graphql.language.Value;

public class ReadDataFromExcel {

	
	public String readdataFromExcelFile(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Testdata/TestDatas.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
}
