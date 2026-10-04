package ObRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage {
	
	public productpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement prodname;
	
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']")
	private WebElement prodname1;
	
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement prodname2;
	
	public WebElement getProdname2() {
		return prodname2;
	}

	@FindBy(id="add-to-cart")
	private WebElement AddTocartBtn;
	
	@FindBy(className="shopping_cart_link")
	private WebElement cartIcon;
	
	@FindBy(className="product_sort_container")
	private WebElement productSortContainer;

	public WebElement getProductSortContainer() {
		return productSortContainer;
	}

	public WebElement getProdname() {
		return prodname;
	}

	public WebElement getProdname1() {
		return prodname1;
	}

	public WebElement getAddTocartBtn() {
		return AddTocartBtn;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	
	

	

}
