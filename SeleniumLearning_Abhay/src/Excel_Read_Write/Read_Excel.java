package Excel_Read_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
public static void main(String[] args) throws IOException {
	//to get path of excel file
	File path=new File("C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\Demo.xlsx");
	//to load file
	FileInputStream load=new FileInputStream(path);
	//accessing the excel workbook
	XSSFWorkbook workbook=new XSSFWorkbook(load);
	//get sheet from workbook which we want to read
	XSSFSheet Sheet=workbook.getSheetAt(0);
	
	String data = Sheet.getRow(3).getCell(0).getStringCellValue();
	System.out.println(data);
	
}
}
