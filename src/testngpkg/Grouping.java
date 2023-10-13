package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url dteails");
	}
	@Test(groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void methodclose()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("aftertest");
	}
	
	
}
