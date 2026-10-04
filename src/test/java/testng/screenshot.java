package testng;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Date date= new Date();
		String newdate = date.toString().replace(" ", "_").replace(":", "_");
		
	
		TakesScreenshot ts = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshot/TakeSS_"+newdate+".png");
	FileHandler.copy(temp, perm);
	}

}
