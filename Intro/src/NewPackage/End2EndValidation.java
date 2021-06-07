package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Disabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Enabled");
			Assert.assertFalse(false);
		}
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		int i=1;
		for(i=1;i<4;i++)
		{
			driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_Adult\']/option[4]")).click();
			
		}
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
