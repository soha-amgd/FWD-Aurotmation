package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetpassPage extends PageBase 
{

	public ForgetpassPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (linkText = "Forgot your password?")
	WebElement forgetBtn;

	@FindBy (id="email")
	WebElement emilTxtBox;

	@FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p")
	WebElement retriveBtn;

	@FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
	public WebElement confMsg;


	public void userForgetpass ()
	{
		clickButton(forgetBtn);
	}

	public void usermail(String mail)
	{
		setTextElementText(emilTxtBox, mail);
		clickButton(retriveBtn);
	}



}
