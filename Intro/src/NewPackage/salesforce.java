package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://login.salesforce.com/");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		
	}

}
