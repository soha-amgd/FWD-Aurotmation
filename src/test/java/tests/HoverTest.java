package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoverPage;

public class HoverTest extends TestBase
{
	HomePage homeObject ; 
	HoverPage hoverObject;

	@Test
	public void UserCanHover() 
	{
		homeObject = new HomePage(driver); 
		hoverObject = new HoverPage(driver);

		hoverObject.WomenHover();
		Assert.assertTrue((hoverObject.Top).isDisplayed());

	}
}