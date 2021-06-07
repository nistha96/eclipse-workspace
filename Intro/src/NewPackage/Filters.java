package NewPackage;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> ls = veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), ls.size());
		
	}

}
