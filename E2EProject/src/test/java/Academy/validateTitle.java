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

public class validateTitle extends base{
	public WebDriver driver;
public static Logger Log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initiateDriver();
		
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to home page");
	}
	
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
		
		LandingPage lp = new LandingPage(driver);
		// compare the text from the browser with actual value --Error if fail
		Assert.assertEquals(lp.featureCourse().getText(), "FEATURED COURSES123");
		Log.info("Successfully validated Text message");
		
	}
	@AfterTest
	public void turndown()
	{
		driver.close();
	}
		
		
}

