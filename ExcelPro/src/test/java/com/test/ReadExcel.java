package com.test;

import java.io.FileInputStream;
import java.io.IOException;
//import java.lang.IllegalStateException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public void ReadXl() {
		LoginPage log=new LoginPage();
		String path="C:\\Users\\aamertia\\ExcelAdd\\readXcel.xlsx";
		
		 
		try {
			FileInputStream ipstream=new FileInputStream(path);
			Workbook workbook = WorkbookFactory.create(ipstream);
			Sheet sheet=workbook.getSheet("Login1");
			int lastRowNum=sheet.getLastRowNum();
			for(int i=1;i<=lastRowNum;i++) {
			Row row=sheet.getRow(i);
			Cell cellUN=row.getCell(1);
			Cell cellUN1=row.getCell(2);
			
			String strUN = cellUN.getStringCellValue();
			String strPwd = cellUN1.getStringCellValue();
			
//			System.out.println(strUN);
			log.printLogin(strUN,strPwd);
			}
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		catch(IllegalStateException e){
//			e.printStackTrace();
//		}
		
	}

}
