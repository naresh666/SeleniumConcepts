package allConcepts;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class writeDataExcelFile {
	@Test
	public void writeData() throws IOException {
		//i used testsheet.xlsx file in write data clas it shows The process cannot access the file because it is being used by another process) at java.io.FileOutputStream.open0(Native Method)
		File path=new File("G:\\eclips online installation work location\\3pm class notes\\AllConcepts\\Excelfiles\\writedata.xlsx");
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		sheet1.getRow(2).createCell(2).setCellValue("hello");
		FileOutputStream f_out=new FileOutputStream(path);
		wb.write(f_out);
	}

}
