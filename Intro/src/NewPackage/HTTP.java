package NewPackage;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;


public class HTTP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("E:\\screenshot.png"));*/
		
		
		List <WebElement> list = driver.findElements(By.cssSelector(".gf-li a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : list)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respondCode = conn.getResponseCode();
			System.out.println(respondCode);
			a.assertTrue(respondCode<400, "The link with text "+ link.getText()+ " is broken with code "+ respondCode);
			/*if(respondCode>400)
			{
				System.out.println("The link with text "+ link.getText()+ " is broken with code "+ respondCode);
				Assert.assertTrue(false);
			}*/
			
		}
		
		a.assertAll();
		
		
		/*String url = driver.findElement(By.cssSelector("a[href = 'https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respondCode = conn.getResponseCode();
		System.out.println(respondCode);*/
	}

}
