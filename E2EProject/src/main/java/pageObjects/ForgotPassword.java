package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

public WebDriver driver;
	

	By emailAddress =By.cssSelector("#user_email");
	By sendMeInstruction = By.cssSelector("input[type='submit']");
	

public ForgotPassword(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		 this.driver=driver ;
	}
	public WebElement emailAddress()
	{
		return driver.findElement(emailAddress);
	}
	public WebElement sendMeInstruction()
	{
		return driver.findElement(sendMeInstruction);
	}
	
}
