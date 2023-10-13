package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Amazoncart {
	ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();

}
@Test
public void test1() throws InterruptedException 
{
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
	//driver.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress']")).click();
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();

	
	
	//driver.findElement(By.xpath("//a[@id='nav-cart'])")
	
	//Thread.sleep(6000);

}

}
