package methods;

public class NonStaticM {


	
	public void nonStatic() {
		
		System.out.println("NonStatic Method is Running");
		
	}
	
	public void non1() {
		nonStatic();		
	}
	
	
	public static void main(String[] args) {
		NonStaticM ob = new NonStaticM();
ob.non1();
ob.nonStatic();
	}
	
}
