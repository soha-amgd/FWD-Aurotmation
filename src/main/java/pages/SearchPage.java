package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage  extends PageBase 
{

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "search_query_top")
	WebElement searchTxtBox;

	@FindBy (name = "submit_search")
	WebElement sraechBtn;

	@FindBy (xpath = "//*[@id=\"best-sellers_block_right\"]/h4/a")
	public WebElement topTxt;

	@FindBy (xpath = "//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/div/h5/a")
	WebElement dressBTn;

	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	WebElement addtocard;

	@FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i")
	WebElement checkout;  

	@FindBy (id="cart_title")
	public WebElement cart;

	@FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
	WebElement HomeBtn;


	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement cartBtn;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	public WebElement element;

	public void userSearch (String search)
	{
		setTextElementText(searchTxtBox, search);
		clickButton(sraechBtn);
		//Assert.assertTrue(topTxt.isDisplayed());
	}

	public void addToCart ()
	{
		clickButton(dressBTn);
		clickButton(addtocard);
		clickButton(checkout);
		//Assert.assertTrue(cart.isDisplayed());
	}

	public void checkCart ()
	{
		clickButton(HomeBtn);
		clickButton(cartBtn);
		//Assert.assertTrue(element.isDisplayed());
	}

}
