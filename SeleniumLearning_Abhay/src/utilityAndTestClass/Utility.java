package utilityAndTestClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	String value="";
public void ExcelRead(int sheetNum,int rowNum,int cellNum) throws IOException {
	File path=new File("C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\Demo.xlsx");
	FileInputStream load=new FileInputStream(path);
	XSSFWorkbook workbook=new XSSFWorkbook(load);
	XSSFSheet Sheet=workbook.getSheetAt(sheetNum);
	CellType Type=Sheet.getRow(rowNum).getCell(cellNum).getCellType();
	
	if(Type==CellType.NUMERIC) {
		double num=Sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		int number=(int)num;
		value=String.valueOf(number);	
	}
	else {
		value=Sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
}
}
