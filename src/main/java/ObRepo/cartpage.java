package ObRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	
	public cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement BurgerIcon;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logout;
	
	@FindBy(id="checkout")
	private WebElement checkout;
	
	@FindBy(id="continue-shopping")
	private WebElement continueBtn;
	
	@FindBy(className="inventory_item_name")
	private WebElement inventItem;
	
	@FindBy(id="remove-sauce-labs-onesie")
	private WebElement removeBtn;
	
	@FindBy(id="remove-test.allthethings()-t-shirt-(red)")
	private WebElement removeBtn1;
	
	public WebElement getRemoveBtn1() {
		return removeBtn1;
	}

	public WebElement getBurgerIcon() {
		return BurgerIcon;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getInventItem() {
		return inventItem;
	}

	public WebElement getRemoveBtn() {
		return removeBtn;
	}

	
	


}
