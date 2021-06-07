package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By FeatureCourse = By.cssSelector(".text-center>h2");
	private By Navigation = By.cssSelector("ul[class*='right']");
	private By popup = By.xpath("//button[text()='NO THANKS']"); 
	
public LandingPage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		 this.driver=driver ;
	}
	public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 return new LoginPage(driver);
		 
	}
	public WebElement featureCourse()
	{
		return driver.findElement(FeatureCourse);
	}
	public WebElement Navigation()
	{
		System.out.println("trying to find navigation");
		return driver.findElement(Navigation);
	}
	public List<WebElement> getPopupSize()
	{
		return driver.findElements(popup);
	}
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}	 
	
}
