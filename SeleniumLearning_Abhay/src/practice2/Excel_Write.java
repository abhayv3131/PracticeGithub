package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
public static void main(String[] args) throws IOException {
	File path=new File("C:\\Users\\abhay\\Desktop\\Software Testing\\PracticeExcel.xlsx");
	FileInputStream load=new FileInputStream(path);
	XSSFWorkbook wrbook=new XSSFWorkbook(load);
	XSSFSheet sheet1=wrbook.getSheetAt(0);
	
	FileOutputStream output=new FileOutputStream(path);
	sheet1.createRow(5).createCell(0).setCellValue("practice");
	wrbook.write(output);
}
}
