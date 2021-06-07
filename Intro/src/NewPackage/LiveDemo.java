package NewPackage;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> ls =driver.findElements(By.xpath("//tr/td[1]"));
		List<String> original = ls.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sorted = original.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(original.equals(sorted));
		List<String> price;
		do {
			List<WebElement> row =driver.findElements(By.xpath("//tr/td[1]"));
		 price = row.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggies(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		
		}while(price.size()<1);
		
	}

	private static String getPriceVeggies(WebElement s) {
		// TODO Auto-generated method stub
		String priveValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priveValue;
	}

}
