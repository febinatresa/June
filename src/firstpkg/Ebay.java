package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();

	}
	@Test
	public void test1()
	{
		driver.get("https://www.ebay.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		driver.findElement(By.xpath("//li[6][@class='gh-eb-li gh-margin rt']")).click();
		driver.findElement(By.xpath("//a[@class='fake-btn action start-shop fake-btn--secondary fake-btn--fluid']")).click();
		driver.findElement(By.xpath("//*[@class='hl-cat-nav__container']/li[5]")).click();
	
	}
}
