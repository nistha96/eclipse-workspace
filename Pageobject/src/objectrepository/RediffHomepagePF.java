package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepagePF {

	
	
	WebDriver driver;
	public RediffHomepagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css ="#srchword")
	WebElement Search;
	
	@FindBy(css =".newsrchbtn")
	WebElement submit;
	
	public WebElement Search()
	{
		return Search;
	}
	public WebElement Submit()
	{
		return submit;
	}
}
