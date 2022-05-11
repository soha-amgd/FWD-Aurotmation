package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase
{
	HomePage homeObject;
	LoginPage LoginObject;

	@Test
	public void UserCanLoginSuccssfully ()
	{
		homeObject = new HomePage(driver);
		LoginObject = new LoginPage(driver);

		homeObject.openRegisterationPage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		LoginObject.userlogin("soha@g.com", "1593578");
		Assert.assertTrue(LoginObject.sinOutBtn.isDisplayed());
	}
}
