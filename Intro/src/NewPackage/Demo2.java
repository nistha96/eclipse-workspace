package NewPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();	
	/*driver.get("http://google.com");	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.get("http://yahoo.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();*/
	driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys("This is my code");
	driver.findElement(By.name("pass")).sendKeys("12345");
	//driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
	//driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
	//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
	//driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]/a")).click();
	}

}
