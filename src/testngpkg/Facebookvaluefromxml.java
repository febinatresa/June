package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebookvaluefromxml {
	ChromeDriver driver=new ChromeDriver();
	@BeforeMethod
	public void setup()
	{
		driver.get("https://www.facebook.com");	}
	@Parameters({"email","password"})
	@Test
	public void test1(String v,String c)
	{
		driver.findElement(By.id("email")).sendKeys(v);
		driver.findElement(By.id("pass")).sendKeys(c);
		driver.findElement(By.name("login")).click();
	}

}
