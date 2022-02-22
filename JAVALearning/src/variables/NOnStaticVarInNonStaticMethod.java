package variables;

public class NOnStaticVarInNonStaticMethod {

	int a = 12;
	
	public void m1() {
	
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		NOnStaticVarInNonStaticMethod a1 = new NOnStaticVarInNonStaticMethod();
		a1.m1();
		System.out.println(a1.a);
	}
	
	
}
