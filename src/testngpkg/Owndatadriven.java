package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Owndatadriven {
	
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void setup()
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		
	}
	@Test
	public void test1() throws Exception 	
	{
		FileInputStream f=new FileInputStream("C:\\Users\\deena\\OneDrive\\Desktop\\fblogin.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet sh=w.getSheet("sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			//driver.navigate().back();		
			driver.navigate().refresh();		

		
		}
	}
}
