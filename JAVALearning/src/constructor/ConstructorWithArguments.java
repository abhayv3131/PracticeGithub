package constructor;

public class ConstructorWithArguments {

	
	public ConstructorWithArguments(int a, int b	 ) {
		
		System.out.println("constructor is running");
		
	}
	
	public static void main(String[] args) {
		ConstructorWithArguments obj = new ConstructorWithArguments(10,20);
	}
}
