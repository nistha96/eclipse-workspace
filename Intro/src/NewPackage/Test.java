package NewPackage;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\geckodriver.exe");	
		WebDriver driver= new FirefoxDriver();	
		driver.get("https://google.com");	
		System.out.println(driver.getTitle());

	}

}
