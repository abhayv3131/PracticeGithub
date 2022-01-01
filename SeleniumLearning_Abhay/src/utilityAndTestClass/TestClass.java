package utilityAndTestClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClass {
public void ExcelWrite() throws IOException {
	File path=new File("C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\DemoRead_Write.xlsx");
	FileInputStream load=new FileInputStream(path);
	XSSFWorkbook Workbook=new XSSFWorkbook(load);
	XSSFSheet Sheet=Workbook.getSheetAt(0);

	FileOutputStream output=new FileOutputStream(path);
	Sheet.createRow(0).createCell(0).setCellValue(null);
}
}
