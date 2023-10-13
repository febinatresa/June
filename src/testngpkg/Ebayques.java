package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebayques {
	ChromeDriver driver=new ChromeDriver();

	@BeforeTest
	public void setup()
	{
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void test()
	{
		List<WebElement> linksdetails=driver.findElements(By.tagName("a"));
		System.out.println("no of links"+linksdetails.size());
		
	}
	@Test
	public void test1()
	{
		WebElement searchb=driver.findElement(By.xpath("//input[@id='gh-btn']\r\n"));
		if(searchb.isEnabled())
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not enabld");
		}
		
	}
	@Test
	public void test3()
	{
		Boolean logo=driver.findElement(By.xpath("//input[@id='gh-btn']")).isDisplayed();
		if(logo)
		{
			System.out.println("sucess");
		}
		else
		{
			System.out.println("not");
		}
	}
	//input[@id='gh-btn']
	@Test
	public void test4()
	{
		String sourceCode=driver.getPageSource();
		//System.out.println(sourceCode.contains("gmail"));
		if(sourceCode.contains("Daily Deals"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	

}
