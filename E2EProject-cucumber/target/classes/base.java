package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.WebDriver.Timeouts.implicitlyWait​(long, TimeUnit);

public class base {

	public WebDriver driver;
	public Properties prop;
	@SuppressWarnings("deprecation")
	public WebDriver initiateDriver() throws IOException
	{
		//chrome
		 prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		// mvn test -Dbrowser=chrome
		//String browserName = System.getProperty("browser");
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
			driver	 = new ChromeDriver();
		}
		/*if(browserName.contains("chrome"))
		{
			//execute in chrome
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if(browserName.contains("headless"))
			options.addArguments("headless");
			driver	 = new ChromeDriver(options);
			
		}*/
		else if(browserName.equals("firefox"))
		{
			// execute in firefox
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver	 = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			// execute in IE
			driver	 = new  InternetExplorerDriver();
		}
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 //driver.manage().timeouts().implicitlyWait(10, null);
 //driver.manage().timeouts().implicitlyWait(TimeUnit.SECONDS);
//WebDriver.Timeouts.implicitlyWait(Duration);
		
 
 return driver;
 

	}
public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source ,new File(destinationFile));
		return destinationFile;
	}
	
}
