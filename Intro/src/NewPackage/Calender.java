package NewPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//April 23
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		//driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class = 'datepicker-switch']")).getText().contains("April");
		//Months selection
		while(!driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class = 'datepicker-switch']")).getText().contains("February"))
		{
			driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class='next']")).click();
		}
		//Date selections
		List<WebElement> date = driver.findElements(By.cssSelector(".day"));
		int count = driver.findElements(By.cssSelector(".day")).size();
		
		for(int i = 0 ; i<count; i++)
		{
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("22"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		
	}

}
