package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {ChromeDriver driver=new ChromeDriver();

@BeforeTest
public void setup()
{
	driver.get("https://www.demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
}
@Test
public void test()
{
WebElement Sourcelocator=driver.findElement(By.xpath("//*[@id='products']/div/ul/li[2]/a"));
WebElement Destinationlocator=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
Actions action = new Actions(driver);
action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();

WebElement DestinationCredit=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
action.dragAndDrop(Sourcelocator, DestinationCredit).build().perform();

WebElement Sourcebank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
WebElement Destinationdebitaccount=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
action.dragAndDrop(Sourcebank, Destinationdebitaccount).build().perform();


WebElement SourcelocatorSales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
WebElement DestinationCreditSales=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
action.dragAndDrop(SourcelocatorSales, DestinationCreditSales).build().perform();

WebElement button=driver.findElement(By.xpath("//*[@id='equal'][1]/a"));


//*[@id="equal"]
if(button.getText().equals("Perfect!"))
  {
      System.out.println("Test Pass");
      //return true;
  }
  else{
     System.out.println("Test Failed");
      //return false;
  } 


//*[@id="equal"]/a

	
	
	
	
}

}
