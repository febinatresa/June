package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Fbcreatepage;
import pages.Saucedemopage;

public class SauceDemotest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.saucedemo.com/");
		Saucedemopage ob1=new Saucedemopage(driver);
		FileInputStream f=new FileInputStream("D:\\febina tesing\\assignments\\saucedemo1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{

			ob1.clearFields();
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password ="+password);
			ob1.setValues(username, password);

			ob1.loginbuttonclick();
			if(username.equals("standard_user")) {
			ob1.addtocart();
			ob1.checkout();
			ob1.backhome();
			
			ob1.logout();
			Thread.sleep(3000);
			
			}
			//*[@id="checkout"]
		}
		//driver.navigate().back();
	}

}
