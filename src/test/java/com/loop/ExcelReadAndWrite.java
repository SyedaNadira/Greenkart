package com.loop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadAndWrite {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Owner\\Documents\\ReadJava.xls"));
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		String obj=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(obj);
	


       sheet.getRow(3).getCell(0).setCellValue("Ibrahim");
       FileOutputStream fso= new FileOutputStream("C:\\Users\\Owner\\Documents\\ReadJava.xls");
       wb.write(fso);

       String value2= sheet.getRow(3).getCell(0).getStringCellValue();

         System.out.println(value2);
}
}