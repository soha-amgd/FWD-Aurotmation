package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignOutPage;

public class SignOutTest extends TestBase{
	HomePage homeObject ;
	SignOutPage SignoutObject;
	LoginPage LoginObject;
	@Test
	public void UserCanSinOut() 
	{
		homeObject = new HomePage(driver); 
		LoginObject = new LoginPage(driver);
		SignoutObject = new SignOutPage(driver);

		homeObject.openRegisterationPage();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginObject.userlogin("soha@g.com", "1593578");
		SignoutObject.signout();
		Assert.assertTrue(SignoutObject.signinBtn.isDisplayed());
	}
}
