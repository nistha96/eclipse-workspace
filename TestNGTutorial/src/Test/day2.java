package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups = {"Smoke"})
	public void loan()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("i will execute first");
	}
	@Parameters({"URL"})
	@Test
	public void personalhomeloan(String urlname)
	{
		System.out.println("Home loan");
		System.out.println(urlname);
	}
}
