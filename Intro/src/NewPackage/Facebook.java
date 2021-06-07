package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://redcliff.com");
		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("My own xpath");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nistha@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();  */
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("My own CSS");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
