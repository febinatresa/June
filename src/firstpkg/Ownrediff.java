package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ownrediff {ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();

}
@Test
public void test1()
{
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("febina");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("febina");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
driver.findElement(By.xpath("//*[@id='recommend_text']/table/tbody/tr[1]/td[2]")).click();

	
}
}
