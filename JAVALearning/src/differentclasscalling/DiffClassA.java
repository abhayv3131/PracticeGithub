package differentclasscalling;

public class DiffClassA {


	
	public static void m1() {
		
		
		System.out.println("Class A with m1(Static method) is running");
	}
	
	
	public void m2() {
		
		System.out.println("Class A with m2(NonStatic method) is running");
		
	}

     public static void main(String[] args) {
	    m1();
    	 
}

}
