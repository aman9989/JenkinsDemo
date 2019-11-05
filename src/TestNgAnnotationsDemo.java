import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationsDemo {

	@Test
	public void aTestCase() {
		System.out.println("A Test Case Method");
	}
	
	@Test
	public void bTestCase() {
		System.out.println("B Test Case Method");
	}
	
	@Test(enabled=false)
	public void cTestCase() {
		System.out.println("c Test Case Method");
	}
	
	@Test
	public void dTestCase() {
		System.out.println("d Test Case Method");
	}
	
	@BeforeMethod
	public void runprerequisite() {
		System.out.println("Run Pre Requisite : Before Method");
	}
	
	@AfterMethod
	public void afterexecution() {
		System.out.println("After Execution: After Method");
	}
	
	@BeforeClass
	public void bClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void aClass() {
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void bTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void aTest() {
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void bSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void aSuite() {
		System.out.println("After Suite");
	}
}
