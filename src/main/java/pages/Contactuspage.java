package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Contactuspage extends PageBase{

	public Contactuspage (WebDriver driver)
	{
		super(driver);
	}

	@FindBy (id="id_contact")
	WebElement subjetHeading;

	@FindBy (id="email")
	WebElement email;

	@FindBy (id="id_order")
	WebElement order;

	@FindBy (id="message")
	WebElement message;

	@FindBy (id="fileUpload")
	WebElement fileUpload;

	@FindBy (id="submitMessage")
	WebElement sendbutton;

	@FindBy (xpath = "//*[@id=\"center_column\"]/p")
	WebElement Completionmsg;


	public void droplist()
	{
		Select options = new Select(subjetHeading);
		options.selectByValue("1");
	}

	//	public void senddata( String orderdata)
	//	{
	//		//setTextElementText(email, emaildata);
	//		setTextElementText(order, orderdata);
	//	}

	public void testuploadfile()
	{
		String pdfname="Khamsat.pdf";
		String pdfpath=System.getProperty("user.dir")+"/uploads/"+pdfname;
		fileUpload.sendKeys(pdfpath);
	}

	public void messagedata( String messageedata )
	{
		setTextElementText(message, messageedata);
	}

	public void clicksendbutton()
	{
		clickButton(sendbutton);
	}
	public String GetSucessMsg()
	{
		return Completionmsg.getText();
	}
}
