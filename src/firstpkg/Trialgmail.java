package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trialgmail {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();

	}
	@Test
	public void test1()
	{
		driver.get("https://www.jollysilks.com/?gclid=EAIaIQobChMIwp_ppriqgQMVtwp7Bx3QhAaFEAAYASAAEgIHDfD_BwE");
		boolean logo=driver.findElement(By.xpath("//img[@class='header-header_logo-1q2']")).isDisplayed();
		if(logo)
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("logo not displayed");
		}
		//img[@class='header-header_logo-1q2']
	}
	
}
