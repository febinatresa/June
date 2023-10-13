package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver=new ChromeDriver();


	@BeforeTest
	public void setup()
	{
	driver.get("https://www.demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));

		
		driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\\\feby\\\\Test.xlsx");
		//driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("D:\\feby\\Test.xlsx");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	
	}

	
	
}
