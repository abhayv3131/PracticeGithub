package constructor;

public class MultipleConstructorCanBePresent {

	
	public MultipleConstructorCanBePresent(int a ,boolean b) {
		
		System.out.println("Constructor 1");
	}
	
public MultipleConstructorCanBePresent (int a) {
		
		System.out.println("Constructor 2");
		
	}
	
	
	public static void main(String[] args) {
		MultipleConstructorCanBePresent obj = new MultipleConstructorCanBePresent(50,true);
	}
	
}
