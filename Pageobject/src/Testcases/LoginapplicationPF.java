package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffHomepagePF;
import objectrepository.RediffLoginpage;
import objectrepository.RediffLoginpagePF;

public class LoginapplicationPF {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpagePF rd= new RediffLoginpagePF(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("password");
		//rd.Signin().click();
		rd.rediff().click();
		RediffHomepagePF rm = new RediffHomepagePF(driver);
		rm.Search().sendKeys("rediff");
		rm.Submit().click();
	}

}
