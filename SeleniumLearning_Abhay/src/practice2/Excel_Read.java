package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
public static void main(String[] args) throws InvalidFormatException, IOException {
	File path=new File("C:\\Users\\abhay\\Desktop\\Software Testing\\PracticeExcel.xlsx");
	
	FileInputStream load=new FileInputStream(path);
	
	XSSFWorkbook workbook=new XSSFWorkbook(load);
	
	XSSFSheet sheet1=workbook.getSheetAt(0);
	
	String data=sheet1.getRow(0).getCell(0).getStringCellValue();
	String data2=sheet1.getRow(1).getCell(1).getStringCellValue();
	System.out.println(data2);
	
	
}
}
