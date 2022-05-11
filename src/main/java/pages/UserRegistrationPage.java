package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase 
{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy (id = "email_create")
	WebElement emailTxtBox;

	@FindBy (id = "SubmitCreate")
	WebElement subbtn;


	@FindBy (className = "login-title")
	public WebElement succsessMessage;

	public RgistrationInfo userRegisteration (String email)
	{
		setTextElementText(emailTxtBox, email);
		clickButton(subbtn);
		return new RgistrationInfo(driver);
	}
	
}  
