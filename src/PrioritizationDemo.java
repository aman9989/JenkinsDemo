import org.testng.annotations.Test;

public class PrioritizationDemo {

	@Test(priority=1)
	public void dTestCase() {
		System.out.println("D Test Case Method with priority 1 of Class 1");
	}
	
	@Test(priority=2)
	public void cTestCase() {
		System.out.println("C Test Case Method with priority 2 of Class 1");
	}
	
	@Test(priority=3)
	public void aTestCase() {
		System.out.println("A Test Case Method with priority 3 of Class 1");
	}
	
	@Test //By default priority is 0 i.e. Highest Priority
	public void bTestCase() {
		System.out.println("B Test Case Method with priority 0 of Class 1");
	}
}
