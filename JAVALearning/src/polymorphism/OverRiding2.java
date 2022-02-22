package polymorphism;

public class OverRiding2 extends OverRiding1 {

	public void m2() {
		
		System.out.println("m2 is method of child ");
		
	}
	
	public static void main(String[] args) {
		OverRiding1 ch = new OverRiding2();
		ch.m2();
	}
}

