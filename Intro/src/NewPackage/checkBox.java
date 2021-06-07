package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); 
		System.out.println(driver.findElements(By.cssSelector("input[type=checkbox]")).size());
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
		
		
		/*driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		int i= 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());*/
		
	}

}
