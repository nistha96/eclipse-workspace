package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Begin {
	@AfterTest
	public void lastexecution()
	{
		System.out.println("i am last");
	}
	@Parameters({"URL"})
	@Test
	public void Demo(String urlname)
	{
		System.out.println("hello");
		System.out.println(urlname);
	}
	@AfterSuite()
	public void Afsuit()
	{
	System.out.println("I am Last one");
	}
	@Test
	public void failTest()
	{
		System.out.println("Fail");
		Assert.assertTrue(false);
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}

}
