package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends PageBase  
{

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	@FindBy (id="email")
	WebElement mailTxtBox;

	@FindBy (id="passwd")
	WebElement passwdTxtBox;

	@FindBy(id="SubmitLogin")
	WebElement submitBtn;

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	public WebElement sinOutBtn;

	public void userlogin (String email,String pass)
	{
		setTextElementText(mailTxtBox, email);
		setTextElementText(passwdTxtBox, pass);
		clickButton(submitBtn);
		//Assert.assertTrue(sinOutBtn.isDisplayed());
	}


}
