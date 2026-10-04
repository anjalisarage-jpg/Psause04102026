package GenUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverutility {
	
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public void waitForVisibilityOfElement(WebElement element,WebDriver driver)
	{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver, String idorname)
	{
		driver.switchTo().frame(idorname);
	}
	
	public void switchToFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void switchToAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public String switchToAlertAndText(WebDriver driver)
	{
		String text1 = driver.switchTo().alert().getText();
		return text1;
	}
	
	public void switchToAlertAndSenDKeys(WebDriver driver, String text)
	{
		driver.switchTo().alert().sendKeys(text);
		
	}
	
	public void select(WebElement element,int index)
	{
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}
	
	public void select(WebElement element, String value)
	{
		Select sel= new Select(element);
		sel.selectByValue(value);
	}
	
	public void select(String text,WebElement element)
	{
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void mouseHoverOnWebElement(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.doubleClick(element);
	}
	

}
