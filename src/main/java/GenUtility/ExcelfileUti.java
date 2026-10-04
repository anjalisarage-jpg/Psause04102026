package GenUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelfileUti {
	
	public String toReaddatafromexcelfile(String sheetname,int rowno, int cellno) throws Throwable
	{
		FileInputStream fis1= new FileInputStream
				("C:\\Users\\Aarushi\\eclipse-workspace\\PractiseSauce\\src\\test\\resources\\TestData2.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	Sheet sh = wb.getSheet(sheetname);
	Row rw = sh.getRow(rowno);
	Cell cell = rw.getCell(cellno);
	String data = cell.getStringCellValue();
	return data;
	}
	

}
