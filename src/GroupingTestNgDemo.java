import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingTestNgDemo {

	@BeforeGroups("Smoke")
	public void bGroups() {
		System.out.println("Smoke Before Groups Methods");
	}
	
	@AfterGroups("Smoke")
	public void aGroups() {
		System.out.println("Smoke After Groups Methods");
	}
	
	@Test(groups="Smoke")
	public void aTestCase() {
		System.out.println("Smoke - A Test Case");
	}
	
	@Test(groups="Sanity,Regression")
	public void bTestCase() {
		System.out.println("Sanity and Regression - B Test Case");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void b2TestCase() {
		System.out.println("Sanity or Regression - B2 Test Case");
	}
	
	@Test(groups="Sanity")
	public void b1TestCase() {
		System.out.println("Sanity - B1 Test Case");
	}
	
	@Test(groups="Regression")
	public void cTestCase() {
		System.out.println("Regression - C Test Case");
	}
	
	@Test(groups="Functional")
	public void dTestCase() {
		System.out.println("Functional - D Test Case");
	}
}
