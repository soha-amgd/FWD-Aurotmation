package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;
public class HomePage extends PageBase  {
	String baseURL;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy (linkText = "Sign in")
	WebElement signupbutton;

	@FindBy (linkText = "Contact us")
	WebElement contactusbutton;



	public void openRegisterationPage ()
	{
		signupbutton.click();
	}

	public void  opencontactuspage()
	{
		contactusbutton.click();
	}

}
