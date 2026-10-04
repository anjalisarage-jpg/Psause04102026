package testng;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion1 {
	
	@Test
	public void login()
	{
		String exp = "facebook";
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		@Nullable
		String act = driver.getTitle();
		
		Assert.assertEquals(act, exp);
		System.out.println("Hi");
	}

}
