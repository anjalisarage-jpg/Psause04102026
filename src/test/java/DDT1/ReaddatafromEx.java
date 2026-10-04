package DDT1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromEx {
	
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis1= new FileInputStream
				("C:\\Users\\Aarushi\\eclipse-workspace\\PractiseSauce\\src\\test\\resources\\TestData2.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
	Sheet sh = wb.getSheet("Product");
	Row rw = sh.getRow(1);
 String product = rw.getCell(2).getStringCellValue();
System.out.println(product);
		
	}

}
