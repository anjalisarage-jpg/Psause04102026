package DDT1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class Readdatafrompropf {
	
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis= new FileInputStream
			("C:\\Users\\Aarushi\\eclipse-workspace\\PractiseSauce\\src\\test\\resources\\Commondata1Prac.Properties");
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty("Url");
		String BROWSER = p.getProperty("Browser");
		String USERNAME = p.getProperty("Username");
		String PASSWORD = p.getProperty("Password");
		
		WebDriver driver=null;
		
		if(BROWSER.equals("Chrome"))
				{
			driver= new ChromeDriver();
				}
		else if(BROWSER.equals("Edge"))
		{
			driver= new EdgeDriver();
		}
		else if(BROWSER.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
	}

}
