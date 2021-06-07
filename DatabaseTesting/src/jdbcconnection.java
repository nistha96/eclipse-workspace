import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "password");
		java.sql.Statement s =  con.createStatement();
		ResultSet rs= s.executeQuery("select * from Employeeinfo");
		while(rs.next())
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://login.salesforce.com");
			//System.out.println(rs.getInt("id"));
			//ystem.out.println(rs.getString("location"));
			//System.out.println(rs.getInt("age"));
			driver.findElement(By.cssSelector("#username")).sendKeys(rs.getString("username"));
			driver.findElement(By.cssSelector("#password")).sendKeys(rs.getString("password"));
		}
	}

}
