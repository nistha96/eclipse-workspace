package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new  WebDriverWait(driver,5);
		
		//expected list of veggies
		String[] veggies = {"Cucumber","Brocolli","Beetroot"};
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText())
		;
		
	}

	public static void addItems(WebDriver driver, String[]veggies)
	{
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		//System.out.println("size="+products.size());
		for (int i=0;i<products.size();i++)
		{
			 String[] name = products.get(i).getText().split("-");
			 String formattedName = name[0].trim();
			 
			 //if(name.contains("Cucumber"))
			//System.out.println(i);
			// if(i==1 || i==3 || i==4)
			 List veggiesList = Arrays.asList(veggies);
			 if(veggiesList.contains(formattedName))
			 //if(name.contains(names))
			 {
				 j++;
				 //click on add to cart
				  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				 //System.out.println("clicking on i =  "+i);
				 // driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/div[3]/button")).click();
				  //i = 3;
				 // driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/div[3]/button")).click();
				  
				  
				  if(j==veggies.length)
				  break;
			 }
		}
	}
}
