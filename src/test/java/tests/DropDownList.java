package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.PageBase;

public class DropDownList extends PageBase {

	public DropDownList(WebDriver driver) {
		super(driver);
	}

	public void Droplist()
	{
		WebElement listoptions=driver.findElement(By.id("days"));
		Select options= new Select(listoptions); 
		options.selectByValue("2");

		WebElement listoptions2=driver.findElement(By.id("months"));
		options= new Select(listoptions2); 
		options.selectByValue("3");

		WebElement listoptions3=driver.findElement(By.id("years"));
		options= new Select(listoptions3); 
		options.selectByValue("2020");

		WebElement listoptions4=driver.findElement(By.id("id_state"));
		options= new Select(listoptions4); 
		options.selectByValue("5");

		WebElement listoptions5=driver.findElement(By.id("id_country"));
		options= new Select(listoptions5); 
		options.selectByValue("21");
	}
}
