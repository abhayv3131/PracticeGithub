package tesNG_Practice2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class {

	@BeforeSuite
	public void M1() {
		System.out.println("before suite is running");
	}
	
	@BeforeTest
	public void M2() {
		System.out.println("before test is running");
	}
	
	@BeforeClass
	public void M3() {
		System.out.println("before class is running");
	}
	
	@BeforeMethod
	public void M4() {
		System.out.println("before method is running");
	}
	
	@Test
	public void main() {
		System.out.println("main test is running");
	}
	
	@Test
	public void main2() {
		System.out.println("main test2 is running");
	}
	
	@AfterMethod
	public void M5() {
		System.out.println("after method is running");
	}
	
	@AfterClass
	public void M6() {
		System.out.println("after class is running");
	}
	
	@AfterTest
	public void M7() {
		System.out.println("after test is running");
	}
	
	@AfterSuite
	public void M8() {
		System.out.println("after suite is running");
	}
}
