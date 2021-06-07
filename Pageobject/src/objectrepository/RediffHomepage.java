package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {

	
	
	WebDriver driver;
	public RediffHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	By Search  = By.cssSelector("#srchword");
	By submit = By.cssSelector(".newsrchbtn");
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
}
