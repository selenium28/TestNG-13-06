package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class EnableDisableClass {

	@Test
	public void testcase() {
		System.out.println("testcase one");
	}
	
	@Test
	public void testcase1() {
		System.out.println("testcase two");
	}
	
	@Test
	public void testcase2() {
		System.out.println("testcase three");
	}
	
	@Test
	public void testcase3() {
		System.out.println("testcase four");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
