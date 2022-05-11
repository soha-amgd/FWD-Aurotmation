package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgetpassPage;
import pages.HomePage;

public class ForgetpassTest extends TestBase {
	HomePage homeObject;
	ForgetpassPage forgetObject;

	@Test
	public void UserForgetPassword ()
	{
		homeObject = new HomePage(driver);
		forgetObject =new ForgetpassPage(driver);

		homeObject.openRegisterationPage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		forgetObject.userForgetpass();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		forgetObject.usermail("sohaamgd2@gmail.com");
		Assert.assertTrue(forgetObject.confMsg.isDisplayed());
	}

}
