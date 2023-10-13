package firstpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverificationjunit {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void titleVerification()
	{
			
		String actualTitle=driver.getTitle();
		String expTitle="Google";
		if(actualTitle.equals(expTitle))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void pageSource()
	{	
		String sourceCode=driver.getPageSource();
		//System.out.println(sourceCode.contains("gmail"));
		if(sourceCode.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
	}
	@After
	public void close(){
		driver.close();
	}
	
	
}
