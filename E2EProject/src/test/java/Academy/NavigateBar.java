package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class NavigateBar extends base{
	public WebDriver driver;
	public static Logger Log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initiateDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
		
		//driver.get("http://qaclickacademy.com/");
		LandingPage lp = new LandingPage(driver);
		// compare the text from the browser with actual value --Error if fail
		Assert.assertTrue(lp.Navigation().isDisplayed());
		Log.info("Successfully displaying Navigation bar");
		
	}
		
	@AfterTest
	public void turndown()
	{
		driver.close();
	}
		
}

