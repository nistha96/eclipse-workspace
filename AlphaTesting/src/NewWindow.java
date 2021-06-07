import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String ParentWindowId = it.next();
		String ChildWindowId = it.next();
		driver.switchTo().window(ChildWindowId);
		driver.get("https://rahulshettyacademy.com/");
		String CourseName =driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(ParentWindowId);
		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(CourseName);
		File  file  = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("F://logo.png"));
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}
	

}
