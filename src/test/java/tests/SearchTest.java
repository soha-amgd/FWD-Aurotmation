package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class SearchTest extends TestBase {

	HomePage homeObject;
	LoginPage LoginObject;
	SearchPage SearchObject;

	@Test
	public void UserCanSearchSuccssfully ()
	{
		homeObject = new HomePage(driver);
		LoginObject = new LoginPage(driver);
		SearchObject = new SearchPage(driver);

		homeObject.openRegisterationPage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		LoginObject.userlogin("soha@g.com", "1593578");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SearchObject.userSearch("dress");
		Assert.assertTrue(SearchObject.topTxt.isDisplayed());
		SearchObject.addToCart();
		Assert.assertTrue(SearchObject.cart.isDisplayed());
		SearchObject.checkCart();
		Assert.assertTrue(SearchObject.element.isDisplayed());
	}
}
