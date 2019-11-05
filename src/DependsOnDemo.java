import org.testng.annotations.Test;

public class DependsOnDemo {

	@Test(dependsOnMethods="bTestCase")
	public void aTestCase() {
		System.out.println("A Test Case Method");
	}
	
	@Test(dependsOnMethods="cTestCase")
	public void bTestCase() {
		System.out.println("B Test Case Method");
	}
	
	@Test()
	public void cTestCase() {
		System.out.println("C Test Case Method");
	}
	
	@Test(dependsOnMethods="cTestCase")
	public void dTestCase() {
		System.out.println("D Test Case Method");
	}
}
