package polymorphism;

public class OverLoading1 {

	
	public void m1(int a) {
		System.out.println("Non static method with int value is running");
	}
	
	public void m1() {
		System.out.println("Non static method with no arguement is running");
	}
	
	public void m1(int a,boolean c) {
		System.out.println("non static method with int and boolean is running");
	}
	
	public static void m1(boolean a, int b) {
		
		System.out.println("static method with boolean and int is running");
	}
	
	public static void main(String[] args) {
		OverLoading1 overload = new OverLoading1();
		overload.m1(20);
	}
	
}
