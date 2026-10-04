package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dp {
	
	@Test(dataProvider ="details")
	public void login(String un,String pw)
	{
		System.out.println(un+"===="+pw);
	}
	@DataProvider
	
	public Object[][] details()
	{
	Object[][] obj= new Object[2][2];
	obj[0][0]="dhoni12";
	obj[0][1]="mehak1";
	obj[1][0]="rani12";
	obj[1][1]="anju2";
	return obj;
	
}
}