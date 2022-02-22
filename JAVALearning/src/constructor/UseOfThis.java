package constructor;

public class UseOfThis {

	
	public UseOfThis(int a , boolean b) {
		
		System.out.println("top constructor is running");
		
	}
	
	public UseOfThis() {
		this(10, false);
		
		System.out.println("down constructor is running");
	}
	
	public static void main(String[] args) {
		
		UseOfThis obj = new UseOfThis();
	}	
}
