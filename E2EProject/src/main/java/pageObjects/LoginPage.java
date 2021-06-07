package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebDriver driver;
	
	By email = By.cssSelector("#user_email");
	By password = By.cssSelector("#user_password");
	By login = By.cssSelector("input[type='submit']");
	By forgotPassword = By.cssSelector("a[class*='link']");
	

public LoginPage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		 this.driver=driver ;
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}
	public ForgotPassword forgotPassword()
	{
		 driver.findElement(forgotPassword).click();
		 return  new ForgotPassword(driver);
		
	}
}
