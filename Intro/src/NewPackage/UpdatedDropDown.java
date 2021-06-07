package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		//driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		//WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		//Select dropdown = new Select(staticDropdown);
		//driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		int i= 1;
		while(i<5)
		{
			//driver.findElement(By.id("hrefIncAdt")).click();
			//dropdown.selectByValue("5");
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]/option[5]")).click();
			i++;
		}
		//driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
	}

}
