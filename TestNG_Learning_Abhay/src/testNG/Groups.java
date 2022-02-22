package testNG;

import org.testng.annotations.Test;

public class Groups {

@Test(priority=0,groups= {"abhay"})
public void Group1() {
	System.out.println("Group 1 is running");
}

@Test(priority=1,groups= {"didu"})
public void Group2() {
	System.out.println("Group 2 is running");
}
}
