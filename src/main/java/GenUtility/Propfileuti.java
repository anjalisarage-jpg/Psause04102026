package GenUtility;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propfileuti {
	
	public String toReaddatafromfile(String Key) throws Throwable
	{
		FileInputStream fis1= new FileInputStream
	("C:\\Users\\Aarushi\\eclipse-workspace\\PractiseSauce\\src\\test\\resources\\Commondata1Prac.Properties");
		Properties p= new Properties();
		p.load(fis1);
		String value = p.getProperty(Key);
         return value;

	}

}
