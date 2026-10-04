package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class newTest {
  @Test
  public void tc() {
	  Reporter.log("tc executed", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("login", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("logout", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("broser open", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("broser close", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("precond", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("postcond", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("db open", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("db close", true);
  }

}
