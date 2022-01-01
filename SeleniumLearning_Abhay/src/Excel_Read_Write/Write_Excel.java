package Excel_Read_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
public static void main(String[] args) throws IOException {
	File path=new File("C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\Demo.xlsx");
	FileInputStream load=new FileInputStream(path);
	XSSFWorkbook Workbook=new XSSFWorkbook(load);
	XSSFSheet Sheet=Workbook.getSheetAt(0);

	FileOutputStream output=new FileOutputStream(path);
	Sheet.createRow(1).createCell(0).setCellValue("Ravindra");
	Workbook.write(output);
}
}
