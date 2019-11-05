import org.testng.annotations.Test;

public class PrioritizationDemo2 {

	@Test(priority=7)
	public void hTestCase() {
		System.out.println("H Test Case Method with priority 7 of Class 2");
	}
	
	@Test(priority=5)
	public void iTestCase() {
		System.out.println("I Test Case Method with priority 5 of Class 2");
	}
	
	@Test(priority=6)
	public void vTestCase() {
		System.out.println("V Test Case Method with priority 6 of Class 2");
	}
	
	@Test(priority=0) //By default priority is 0 i.e. Highest Priority
	public void fTestCase() {
		System.out.println("F Test Case Method with priority 0 of Class 2");
	}
}
