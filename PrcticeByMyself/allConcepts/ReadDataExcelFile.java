package allConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataExcelFile {
	@Test
	public void method1() throws IOException {
		File file = new File(".//Excelfiles/testsheet.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String cell1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String cell2 = sheet1.getRow(1).getCell(0).getStringCellValue();
	//here if we give sheet1.getRow(1).getCell(1).getStringCellValue();
		//in that excel file i saved data in 2nd row in the format of integer...
		//at that time it will give  "java.lang.IllegalStateException: Cannot get a text value from a numeric cell" type error
	
		System.out.println(cell1);
		System.out.println(cell2);
		
		fis.close();
		
		

	}

}
