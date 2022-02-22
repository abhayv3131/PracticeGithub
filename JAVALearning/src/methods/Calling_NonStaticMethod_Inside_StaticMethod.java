package methods;

public class Calling_NonStaticMethod_Inside_StaticMethod {

		
	Calling_NonStaticMethod_Inside_StaticMethod objRef = new Calling_NonStaticMethod_Inside_StaticMethod();
	
	// calling NonStatic method inside Static method
	
	public void nonStatic() {
		
		System.out.println("calling NonStatic method through Static method");
	}
	
	public static void staticMethod() {
		Calling_NonStaticMethod_Inside_StaticMethod objRef = new Calling_NonStaticMethod_Inside_StaticMethod();
		
		objRef.nonStatic();
	}
	
	public static void main(String[] args) {
		staticMethod();		
	}
	
	
	
	
	
}
