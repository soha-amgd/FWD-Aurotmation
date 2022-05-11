package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

public class HomePageTest extends TestBase {
	HomePage homeObject;
	UserRegistrationPage registerObject;
	@Test
	public void UserCanRegisterSuccssfully ()
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterationPage();

	}
}
