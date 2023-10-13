package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonscrolldown {

	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void setup()
	{
	driver.get("https://www.amazon.in/");
	}
	@Test
	public void test1()
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/table/tbody/tr[1]/td[1]/a/span")).click();
	
	}
	
	
}
