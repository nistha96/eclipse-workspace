package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	
	@Test(groups = {"Smoke"})
	public void WebloginHomeLoan()
	{
		//selenium
		System.out.println("web login home");
	}
	@Parameters({"URL"})
	@Test(timeOut = 4000)
	public void MobileLoginHomeLoan(String urlname)
	{
		//Appium
		System.out.println("Mobile login home");
		System.out.println(urlname);
	}
	
	@Test(enabled = true)
	public void LoginAPIHomeLoan()
	{
		//Rest API
		System.out.println("API login home");
	}
}
