package Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenUtility.ExcelfileUti;
import GenUtility.Propfileuti;
import GenUtility.Webdriverutility;
import ObRepo.cartpage;
import ObRepo.loginPage;
import ObRepo.productpage;
import basetest.baseclass;
@Listeners(listenerutil.listenerimplclass.class)
public class AddlowPrcartTest extends baseclass {
@Test(groups = "regression")
public void addlowproTest() throws Throwable

{
		
	//WebDriver driver= new EdgeDriver();
	/*FileInputStream fis= new FileInputStream
			("C:\\Users\\Aarushi\\eclipse-workspace\\PractiseSauce\\src\\test\\resources\\Commondata1Prac.Properties");
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty("Url");
		String BROWSER = p.getProperty("Browser");
		String USERNAME = p.getProperty("Username");
		String PASSWORD = p.getProperty("Password");*/
	//Propfileuti putil= new Propfileuti();
	ExcelfileUti exutil= new ExcelfileUti();
	//Webdriverutility wutil= new Webdriverutility();
	
	/*String URL = putil.toReaddatafromfile("Url");
	String BROWSER = putil.toReaddatafromfile("Browser");
	String PASSWORD = putil.toReaddatafromfile("Password");
	String USERNAME = putil.toReaddatafromfile("Username");
	
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
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	wutil.waitForPageToLoad(driver);
	driver.get(URL);
	
	//login
	//driver.findElement(By.id("user-name")).sendKeys("standard_user");
   // driver.findElement(By.id("password")).sendKeys("secret_sauce");
   // driver.findElement(By.id("login-button")).click();
	/*driver.findElement(By.id("user-name")).sendKeys(USERNAME);
	driver.findElement(By.id("password")).sendKeys(PASSWORD);
	driver.findElement(By.id("login-button")).click();*/
	/*loginPage lp= new loginPage(driver);
	lp.getUsername().sendKeys(USERNAME);
	lp.getPassword().sendKeys(PASSWORD);
	lp.getLoginbt().click();
   
	
	/*FileInputStream fis1= new FileInputStream
			("C:\\Users\\Aarushi\\eclipse-workspace\\PractiseSauce\\src\\test\\resources\\TestData2.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
Sheet sh = wb.getSheet("Product");
Row rw = sh.getRow(4);
String product1 = rw.getCell(3).getStringCellValue();*/
	String prod2 = exutil.toReaddatafromexcelfile("Product", 4, 3);

  //add lowest product
  		/*driver.findElement(By.xpath("//div[text()='"+prod2+"']")).click();
  		driver.findElement(By.id("add-to-cart")).click();
  		
  		driver.findElement(By.className("shopping_cart_link")).click();*/
	productpage pp= new productpage(driver);
	pp.getProdname1().click();
	pp.getAddTocartBtn().click();
	pp.getCartIcon().click();
  		
	cartpage cp= new cartpage(driver);
	
  		//validation
  		//String cartItem = driver.findElement(By.className("inventory_item_name")).getText();
	String cartItem = cp.getInventItem().getText();
	Assert.assertEquals(cartItem, prod2);
  		/*if(cartItem.equals(prod2))
  		{
  			System.out.println("pass");
  		}
  		else
  		{
  			System.out.println("fail");
  		}*/
  		
  		//logout
  		//driver.findElement(By.id("react-burger-menu-btn")).click();
  		//driver.findElement(By.id("logout_sidebar_link")).click();
  		
  		//cp.getBurgerIcon().click();
		//cp.getLogout().click();
		
  		//driver.quit();
  	}
}
