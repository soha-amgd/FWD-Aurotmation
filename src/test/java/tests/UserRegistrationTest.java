package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RgistrationInfo;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase 
{
	HomePage homeObject;
	UserRegistrationPage registerObject;
	RgistrationInfo infoObject;

	@Test
	public void UserCanRegisterSuccssfully ()
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterationPage();

		registerObject = new UserRegistrationPage(driver);
		infoObject=new RgistrationInfo(driver);
		registerObject.userRegisteration ("soha@g.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertTrue(infoObject.page.isDisplayed());
		infoObject.gender();
		infoObject.userRegiteration_form( "soha" ,"amgd","1593578");
		infoObject.droplist();
		infoObject.signbtc();
		infoObject.personalinfo("soha","amgd","iti","elorouba","elgzayer","cairo");
		infoObject.dropstate();
		infoObject.pcode("20222");
		infoObject.dropcountry();
		infoObject.addition("test script","259876358","01059876341","elmaadi");
	}
}
