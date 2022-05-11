package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RgistrationInfo extends PageBase {
	//private WebDriver driver;


	public RgistrationInfo(WebDriver driver)
	{
		super(driver); 
		//this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	WebElement genderTxtBox;

	@FindBy (id = "customer_firstname")
	WebElement fnTxtBox;

	@FindBy (id = "customer_lastname")
	WebElement lnTxtBox;

	@FindBy (id = "email")
	WebElement emailTxtBox2;

	@FindBy (id = "passwd")
	WebElement passwordTxtBox;

	@FindBy (id="newsletter")
	WebElement signbtn;

	@FindBy (id="optin")
	WebElement recivebtn;

	@FindBy (id="inputAddress1")
	WebElement streetTxtBox;

	@FindBy (id="firstname")
	WebElement fn2TxtBox;

	@FindBy (id="lastname")
	WebElement ln2TxtBox;

	@FindBy (id="company")
	WebElement compnyTxtBox;

	@FindBy (id="address1")
	WebElement addTxtBox;

	@FindBy (id="address2")
	WebElement add2TxtBox;

	@FindBy (id = "city")
	WebElement cityTxtBox;

	@FindBy (id = "postcode")
	WebElement pcodeTxtBox;

	@FindBy (id = "other")
	WebElement addiTxtBox;

	@FindBy (id = "phone")
	WebElement phTxtBox;

	@FindBy (id = "phone_mobile")
	WebElement mobTxtBox;

	@FindBy (id = "alias")
	WebElement aliasTxtBox;

	@FindBy (id = "submitAccount")
	public WebElement registerBtn;

	@FindBy(className = "page-subheading")
	public WebElement page;

	@FindBy (id = "days")
	WebElement day;

	@FindBy(id="months")
	WebElement month;

	@FindBy (id="years")
	WebElement year;

	@FindBy (id="id_state")
	WebElement state;

	@FindBy (id="id_country")
	WebElement country;

	public void gender()
	{
		//Assert.assertTrue(page.isDisplayed());
		genderTxtBox.click();
	}

	public void userRegiteration_form( String FirstName , String LastName,String pass)
	{
		setTextElementText(fnTxtBox, FirstName);
		setTextElementText(lnTxtBox, LastName);
		setTextElementText(passwordTxtBox, pass);
	}

	public void droplist()
	{
		Select options = new Select(day); 
		options.selectByValue("2");
		options = new Select(month); 
		options.selectByValue("3");
		options = new Select(year); 
		options.selectByValue("2020");
	}

	public void signbtc()
	{
		clickButton(signbtn);
		clickButton(recivebtn);
	}

	public void personalinfo(String Fname2,String Lname2, String company,String street1,
			String street2,String city)
	{
		setTextElementText(fn2TxtBox, Fname2);
		setTextElementText(ln2TxtBox, Lname2);
		setTextElementText(compnyTxtBox, company);
		setTextElementText(addTxtBox, street1);
		setTextElementText(add2TxtBox, street2);
		setTextElementText(cityTxtBox, city);
	}

	public void dropstate()
	{
		Select options= new Select(state); 
		options.selectByValue("5");
	}

	public void pcode(String pcode)
	{
		setTextElementText(pcodeTxtBox, pcode);
	}

	public void dropcountry()
	{
		Select options= new Select(country); 
		options.selectByValue("21");
	}

	public void addition(String addition,String phone ,String mobile, String alias)
	{
		setTextElementText(addiTxtBox, addition);
		setTextElementText(phTxtBox, phone);
		setTextElementText(mobTxtBox, mobile);
		setTextElementText(aliasTxtBox, alias);
		clickButton(registerBtn);
	}

}
