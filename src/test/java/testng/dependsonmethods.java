package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethods {
@Test
public void create()
{
	Reporter.log("created",true);
}
@Test(dependsOnMethods = "create")
public void edit()
{
	Reporter.log("edited",true);
}
@Test(dependsOnMethods = {"create","edit"})
public void delete()
{
	Reporter.log("deleted",true);
}
}
