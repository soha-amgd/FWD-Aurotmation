package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Contactuspage;
import pages.ForgetpassPage;
import pages.HomePage;
import pages.HoverPage;
import pages.LoginPage;
import pages.RgistrationInfo;
import pages.SearchPage;
import pages.SignOutPage;
import pages.UserRegistrationPage;


public class TestScenario extends TestBase {

	HomePage homeObject;
	UserRegistrationPage registerObject;
	RgistrationInfo infoObject;
	SearchPage SearchObject;
	SignOutPage SignoutObject;
	LoginPage LoginObject;
	Contactuspage Contactobject;
	HoverPage hoverObject;
	ForgetpassPage forgetPageObject;

	@Test (priority = 1)
	public void userOpenRegisterationPage() 
	{
		homeObject = new HomePage(driver);

		homeObject.openRegisterationPage();
	}


	@Test (priority = 2)
	public void UserCanRegister ()
	{
		registerObject = new UserRegistrationPage(driver);
		infoObject = new RgistrationInfo(driver);

		registerObject.userRegisteration ("sohaaaa123456789123456@g.com");
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
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test (priority = 3)
	public void userSignOut() 
	{
		SignoutObject = new SignOutPage(driver);

		SignoutObject.signout();
		Assert.assertTrue(SignoutObject.signinBtn.isDisplayed());
	}

	@Test (priority = 4)
	public void userLogInWithValidCredentials() 
	{
		LoginObject = new LoginPage(driver);

		LoginObject.userlogin("sohaaaa123456789123456@g.com", "1593578");
		Assert.assertTrue(LoginObject.sinOutBtn.isDisplayed());
	}


	@Test (priority = 5)
	public void UserCanSearchAndAddItemToCart ()
	{	
		SearchObject = new SearchPage(driver);

		SearchObject.userSearch("dress");
		Assert.assertTrue(SearchObject.topTxt.isDisplayed());
		SearchObject.addToCart();
		Assert.assertTrue(SearchObject.cart.isDisplayed());
		SearchObject.checkCart();
		Assert.assertTrue(SearchObject.element.isDisplayed());
	}

	@Test (priority = 6)
	public void UserOpenContactUsPage()
	{	
		Contactobject = new Contactuspage(driver);

		homeObject.opencontactuspage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Contactobject.droplist();
		Contactobject.testuploadfile();
		Contactobject.messagedata("test concant us");
		Contactobject.clicksendbutton();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		Assert.assertTrue(Contactobject.GetSucessMsg().contains
				("Your message has been successfully sent to our team."),"faild to contact");
	}

	@Test (priority = 7)
	public void UserCanHoverOverAnItem() 
	{
		hoverObject = new HoverPage(driver);

		hoverObject.WomenHover();
		Assert.assertTrue((hoverObject.Top).isDisplayed());
	}

	@Test(priority = 8)
	public void UserForgetPasswordandRetriveIt ()
	{
		forgetPageObject =new ForgetpassPage(driver);

		SignoutObject.signout();
		Assert.assertTrue(SignoutObject.signinBtn.isDisplayed());
		homeObject.openRegisterationPage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		forgetPageObject.userForgetpass();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		forgetPageObject.usermail("sohaaaa123456789123456@g.com");
		Assert.assertTrue(forgetPageObject.confMsg.isDisplayed());
	}

}
