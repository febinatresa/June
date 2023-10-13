package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();

	}
	@Test
	public void test1()
	{
		driver.get("file:///C:/Users/deena/OneDrive/Documents/display.html");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();

		System.out.println(alerttext);
		a.accept();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("abhc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();


	}

}