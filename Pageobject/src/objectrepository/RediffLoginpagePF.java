package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {

	
	
	WebDriver driver;
	public RediffLoginpagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@id=\'login1\']")
	WebElement username;
	
	@FindBy(xpath ="//*[@id='password']")
	WebElement Password;
	
	@FindBy(css ="a.f12")
	WebElement rediff;
	
	
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return Password;
	}
	
	public WebElement rediff()
	{
		return rediff;
	}
	
}
