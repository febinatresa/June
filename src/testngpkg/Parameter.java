package testngpkg;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters("a")
	@Test
	public void test1(String v)
	{
		System.out.println(v);
	}

}
