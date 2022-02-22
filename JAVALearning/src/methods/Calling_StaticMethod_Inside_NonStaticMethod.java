package methods;

public class Calling_StaticMethod_Inside_NonStaticMethod {

	
	public static void staticMethod() {
		
		System.out.println("Static method is running which called by Non static Method");	
	}
	
	public void nonStaticMethod() {
		staticMethod();
		
	}
	
	public static void main(String[] args) {
		
		Calling_StaticMethod_Inside_NonStaticMethod objRef = new Calling_StaticMethod_Inside_NonStaticMethod();
		
		objRef.nonStaticMethod();
			
	} 
}
