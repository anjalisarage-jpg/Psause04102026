package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class assertion2 {
	public static void main(String[] args) {
		String expectedTitle="Faceboo - log in or sign up";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		System.out.println("Step1");
		System.out.println("Step2");
		soft.assertAll();
	}

}
