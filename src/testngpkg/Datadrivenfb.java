package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfb {
	
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void setup()
	{
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void test1() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\deena\\OneDrive\\Desktop\\fblogin.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet sh=wb.getSheet("sheet1");
			int row=sh.getLastRowNum();
			for(int i=1;i<=row;i++)
			{
				String email=sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println("email="+email);
				String password=sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println("password ="+password);
				driver.findElement(By.name("email")).clear();
				driver.findElement(By.name("email")).sendKeys(email);
				driver.findElement(By.name("pass")).clear();
				driver.findElement(By.name("pass")).sendKeys(password);
				driver.findElement(By.name("login")).click();
				driver.navigate().back();		
			}
		
	}

}
