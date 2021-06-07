package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

public class Loginapplication {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd= new RediffLoginpage(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("password");
		//rd.Signin().click();
		rd.rediff().click();
		RediffHomepage rm = new RediffHomepage(driver);
		rm.Search().sendKeys("rediff");
		rm.Submit().click();
	}

}
