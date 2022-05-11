package tests;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Contactuspage;
import pages.HomePage;
import pages.LoginPage;

public class contactus extends TestBase  {
	//    public static WebDriver driver;
	HomePage homeObject;
	Contactuspage Contactobject;
	LoginPage LoginObject;



	//    @Test
	//    public void UserCanRegisterSuccssfully ()
	//    {
	//        homeObject = new HomePage(driver);
	//        Contactobject = new Contactuspage(driver);
	//        
	//        
	//        homeObject.opencontactuspage();
	//        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
	//        Contactobject.droplist();
	//        //System.out.println("00000000000");
	//        Contactobject.senddata("test@test.com","5");
	//        //System.out.println("111111111111111111111");
	//        Contactobject.testuploadfile();
	//        Contactobject.messagedata("test concant us");
	//        Contactobject.clicksendbutton();
	//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
	//        Assert.assertTrue(Contactobject.GetSucessMsg().contains
	//                ("Your message has been successfully sent to our team."),"faild to contact");
	//
	//    }

	@Test
	public void UserCanRegisterSuccssfully ()
	{
		homeObject = new HomePage(driver);
		Contactobject = new Contactuspage(driver);
		LoginObject = new LoginPage(driver);

		homeObject.openRegisterationPage();
		LoginObject.userlogin("soha@g.com", "1593578");
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
}
