package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	public static Logger Log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initiateDriver();
		
	}
	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String Username,String Password,String Text) throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		//lp.featureCourse().getText();
		//lp.getLogin().click();
		LoginPage l=lp.getLogin();//driver.findElement(By.css());
		//LoginPage l = new LoginPage(driver);
		l.email().sendKeys(Username);
		l.password().sendKeys(Password);
		//System.out.println(Text);
		Log.info(Text);
		l.login().click();
		ForgotPassword fp = l.forgotPassword();
		fp.emailAddress().sendKeys("gdfh");
		fp.sendMeInstruction().click();
	}
	@AfterTest
	public void turndown()
	{
		driver.close();
	}
		@DataProvider
		public Object[][] getData()
		{
			//Row stand for how many different data type test should run 
			//columns stand for how many values per each test
			Object[][] data = new Object[2][3];
			//0th row
			data[0][0] = "nonristrected@qw.com";
			data[0][1] = "nistha@123";
			data[0][2] = "Restricted User";
			//1st row
			data[1][0] = "restricteduserabc@qw.com";
			data[1][1] = "password";
			data[1][2] = "Non Restricted User";
			
			return data;
		}
		
}

