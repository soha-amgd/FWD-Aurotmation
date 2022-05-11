package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOutPage extends PageBase{

	//private WebDriver driver;

	public SignOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement signoutBtn;

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	public WebElement signinBtn;

	public void signout()
	{
		clickButton(signoutBtn);
		//Assert.assertTrue(signinBtn.isDisplayed());
	}

}
