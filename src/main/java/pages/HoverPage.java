package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HoverPage extends PageBase{

	//private WebDriver driver;

	public HoverPage(WebDriver driver){
		super(driver);
		action = new Actions(driver);
	}


	@FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement womenHover;


	@FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[1]")
	public WebElement Top;


	public void WomenHover() 
	{
		action
		.moveToElement(womenHover)
		.click()
		.build()
		.perform();

	}
}
