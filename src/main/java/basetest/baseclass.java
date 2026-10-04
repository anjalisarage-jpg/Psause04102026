package basetest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import GenUtility.Propfileuti;
import GenUtility.Webdriverutility;
import ObRepo.cartpage;
import ObRepo.loginPage;

public class baseclass {
	
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	Propfileuti putil= new Propfileuti();
	
	@BeforeSuite(groups = {"smoke","regression"})
	  public void beforeSuite() {
		  Reporter.log("db open", true);
	  }
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"smoke","regression"})
	  //public void beforeClass(String BROWSER) throws Throwable {
		public void beforeClass() throws Throwable {
		
		Propfileuti putil= new Propfileuti();
		//String BROWSER = putil.toReaddatafromfile("Browser");
	String BROWSER = System.getProperty("Browser");
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
		sdriver=driver;
		  Reporter.log("broser open", true);
	  }
	
	@BeforeMethod(groups = {"smoke","regression"})
	  public void beforeMethod() throws Throwable {
		Webdriverutility wutil= new Webdriverutility();
		
		driver.manage().window().maximize();
		wutil.waitForPageToLoad(driver);
		
		String USERNAME = putil.toReaddatafromfile("Username");
		String URL = putil.toReaddatafromfile("Url");
		String PASSWORD = putil.toReaddatafromfile("Password");	

		driver.get(URL);
		
		loginPage lp= new loginPage(driver);
		lp.getUsername().sendKeys(USERNAME);
		lp.getPassword().sendKeys(PASSWORD);
		lp.getLoginbt().click();
		
		  Reporter.log("login", true);
	  }
	 public void tc() {
		  Reporter.log("tc executed", true);
	  }
	

	  @AfterMethod(groups = {"smoke","regression"})
	  public void afterMethod() {
		  cartpage cp= new cartpage(driver);
		  cp.getBurgerIcon().click();
			cp.getLogout().click();
		  Reporter.log("logout", true);
	  }

	  @AfterClass(groups = {"smoke","regression"})
	  public void afterClass() {
		  Reporter.log("broser close", true);
	  }
	  
	  @AfterSuite(groups = {"smoke","regression"})
	  public void afterSuite() {
		  driver.quit();
		  Reporter.log("db close", true);
	  }

	
}
