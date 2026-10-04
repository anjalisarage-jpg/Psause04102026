package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class prioattri {
	@Test(priority=-1)
	public void add()
	{
		Reporter.log("add",true);
	}
	@Test(priority=-2)
	public void mul()
	{
		Reporter.log("mul",true);
	}
	@Test
	public void sub()
	{
		Reporter.log("sub",true);
	}
}
