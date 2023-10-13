package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abcgmail.com");
		//driver.findElement(By.id("pass")).sendKeys("dsf");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("avnm");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//input[@name='login']
		
	}
	

		//input[@placeholder='Password']
	
	
//	//input[@placeholder='Email address or phone number']

}
