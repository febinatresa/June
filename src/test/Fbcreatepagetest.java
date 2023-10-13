package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbcreatepage;

public class Fbcreatepagetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com");
		Fbcreatepage ob1=new Fbcreatepage(driver);
		ob1.createpageclick();
		ob1.getstartedclick();
	}

}
