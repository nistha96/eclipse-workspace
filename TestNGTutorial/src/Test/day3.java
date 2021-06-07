package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void Bclass()
	{
		//selenium
		System.out.println("I will excute before class");
	}
	@AfterClass
	public void Aclass()
	{
		//selenium
		System.out.println("I will excute after class");
	}
	@Parameters({"URL","APIKeys/usrname"})
	@Test
	public void WebloginCarLoan(String urlname , String key)
	{
		//selenium
		System.out.println("web login car");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod
	public void Bmethod()
	{
		//Appium
		System.out.println("Execute me");
	}
	@AfterMethod
	public void Amethod()
	{
		//Appium
		System.out.println("Execute me Later");
	}
	
	@Test(groups = {"Smoke"})
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("Mobile login car");
	}
	@Test
	public void MobilesigninCarLoan()
	{
		//Appium
		System.out.println("Mobile Sign in  car");
	}
	@BeforeSuite()
	public void Bfsuit()
	{
	System.out.println("I an number one");
	}
	
	@Test(dataProvider= "getData")
	public void multipleCase(String username , String password)
	{
		//Appium
		System.out.println("Mobile Signout");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void MobilesignoutCarLoan()
	{
		//Appium
		System.out.println("Mobile Sign out car");
	}
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void APICarLoan()
	{
		//Rest API
		System.out.println("API login car");
	}
	@DataProvider
	public Object[][] getData()
	{
		//Rest API
		Object[][] data =  new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1] = "password";
		data[1][0]="secondsetusername";
		data[1][1] = "secondpassword";
		data[2][0]="thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}
}
