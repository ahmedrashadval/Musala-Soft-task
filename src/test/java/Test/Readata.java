package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readata extends TestBase {
	
	
	@Test(priority =1 , alwaysRun=true)
	public void readdata() throws IOException
	{
		FileInputStream inputStream = new FileInputStream("Data/Data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(2);
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(3);
		Row row4 = sheet.getRow(1);
		Cell cell4 = row4.getCell(4);
	    name = cell1.getStringCellValue(); 
	    email =cell2.getStringCellValue();
	    subject=cell3.getStringCellValue();
	    message=cell4.getStringCellValue();
	    
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(subject);
//		System.out.println(message);
		
		//Applying to new job Data
		Row row5 = sheet.getRow(3);
		Cell cell5 = row5.getCell(1);
		Row row6 = sheet.getRow(3);
		Cell cell6 = row6.getCell(2);
		Row row7 = sheet.getRow(3);
		Cell cell7 = row7.getCell(3);
		Row row8 = sheet.getRow(3);
		Cell cell8 = row8.getCell(4);
		


	    Name=cell5.getStringCellValue();
	    Email=cell6.getStringCellValue();
	    Mob=cell7.getStringCellValue();
	    CV=cell8.getStringCellValue();
	    
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Mob);
		System.out.println(CV);
		
	}


}
