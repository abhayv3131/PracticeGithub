package differentclasscalling;

public class DiffClassB {

	
	
	public static void m3() {
		System.out.println("Class B with M3(Static Method) is running");
	}
	
	public void m4() {
		System.out
		.println("Class B with M4(NonStatic Method) is running)");
	}
	
	
	public static void main(String[] args) {
		
		DiffClassA.m1();  //className.MethodName use kiya bcuz it is static
		
		DiffClassA objOfA = new DiffClassA();  // created an object of classA
		objOfA.m2();         //////// to call non static method of class A i have created an object of classA
		
		m3();
		
		DiffClassB objOfB = new DiffClassB();
		objOfB.m4();
	}           
}
