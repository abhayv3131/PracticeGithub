package testNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Class1 {
@Test(priority=0)
public void test1() {
	 System.out.println("Test 1 is running");
}
@Test(priority=1)
public void abhay() {
System.out.println("abhay is running");
}
@Test(priority=2)
public void testCaseCheck() {
	Reporter.log("Abhay TestNG", true);
}
@Test(priority=3)
public void test3() {
	System.out.println("Test 3 is running");
}
@BeforeMethod
public void beforetest() {
	System.out.println("before method running ");
}
}
