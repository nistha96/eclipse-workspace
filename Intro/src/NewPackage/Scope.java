package NewPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver =  driver.findElement(By.id("gf-BIG"));  // limit web driver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement mini = footerdriver.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));
		System.out.println(mini.findElements(By.tagName("a")).size()); 
		for(int i= 1; i<mini.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			mini.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab); 
			
			Thread.sleep(5000L);
			
		}
			Set<String> windows = driver.getWindowHandles();
			Iterator <String> it = windows.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
			
	}

	private static void window(String next) {
		// TODO Auto-generated method stub
		
	}

}
