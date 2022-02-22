package variables;

public class StaticVariable {

	static int a = 20;   //Static variable also known as Gloabal variable
	static char b;
	static boolean c; 
	
	
	
	public static void m1() {
		System.out.println(a);  //20
	}
	
	
	public static void main(String[] args) {
		m1();  /// a= 20;
		
		a = 21;  // 21
		System.out.println(a);
a = 50;
m1();

	}	
}
