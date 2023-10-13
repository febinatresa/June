package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class justdialdisablenotifications {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		//driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
	}
	@Test
	public void test1()
	{
	driver.get("https://www.justdial.com");
	}

}
