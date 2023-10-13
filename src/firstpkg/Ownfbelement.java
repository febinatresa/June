package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ownfbelement {
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
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("ABC@gmail.com");
	driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("dskjjf");
	driver.findElement(By.name("login")).click();
	String source=driver.getPageSource();
	if(source.contains("login"))
	{
		System.out.println("login present");
	}
	else
	{
		System.out.println("not present");
	}
}
	

}
