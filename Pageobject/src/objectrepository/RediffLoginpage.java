package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	
	
	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By username = By.xpath("//*[@id=\'login1\']");
	By Password = By.xpath("//*[@id='password']");
	By Signin  = By.name("proceed");
	By rediff  = By.cssSelector("a.f12");
	
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement Signin()
	{
		return driver.findElement(Signin);
	}
	public WebElement rediff()
	{
		return driver.findElement(rediff);
	}
	
}
