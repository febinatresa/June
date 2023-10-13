package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaymousehover {

	ChromeDriver driver=new ChromeDriver();

	@BeforeTest
	public void setup()
	{
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void test()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element=driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a"));
		Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));

        WebElement smart=driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
       //actions.moveToElement(smart).click();
        smart.click();
     //   actions.perform();


	}
}
