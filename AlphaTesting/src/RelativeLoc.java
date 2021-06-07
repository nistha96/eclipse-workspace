import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//WebElement nameEditBox = driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-invalid.ng-touched"));
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name = 'name']"));
		System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
		WebElement dateOfBirth = driver.findElement(By.cssSelector("[for = 'dateofBirth']"));
		driver.findElement(withTagName("input").below(dateOfBirth)).sendKeys("02/23/1996");
		//WebElement iceCream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!'"));
		WebElement iceCream = driver.findElement(By.cssSelector("[for = 'exampleCheck1']"));
		driver.findElement(withTagName("input").toLeftOf(iceCream)).click();
		//Get me the label of the first radio button
		WebElement radioButton = driver.findElement(By.cssSelector("#inlineRadio1"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(radioButton)).getText());
	}

}
