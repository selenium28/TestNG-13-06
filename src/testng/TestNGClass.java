package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGClass {
	//testcase
  @Test
  public void testCase() {
	  System.out.println("testcase");
  }
  
  @Test
  public void testCase2() {
	  System.out.println("testcase2");
  }
  //run before each testcase
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }
  

  
//<test> After the all test method but within the <tags>
  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  //before all tests in this suite
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }
//After all the tests
  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

//run After each testcase
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  //before the 1st test method in current class
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

//after all the test method in current class
  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  //<test> before the test method but within the <tags>
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }
}
