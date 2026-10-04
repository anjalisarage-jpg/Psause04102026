package DDT1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdatafromulcell {
public static void main(String[] args) throws Throwable {
	
	FileInputStream fis2= new FileInputStream
			("C:\\Users\\Aarushi\\eclipse-workspace\\PractiseSauce\\src\\test\\resources\\TestData2.xlsx");
	Workbook wb = WorkbookFactory.create(fis2);
	Sheet sh = wb.getSheet("Cart");
	int rowcount = sh.getLastRowNum();
	
	for(int i=1;i<=rowcount;i++)
	{
	String prodname = sh.getRow(i).getCell(0).getStringCellValue();
	String range = sh.getRow(i).getCell(1).getStringCellValue();
	System.out.println(prodname+"===="+range);
	}
}
}
