package variables;

public class NonStaticVariable {
	
	int a = 12; //nonstatic variable
	
	
	public void m1() {
		
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		NonStaticVariable a = new NonStaticVariable();
		System.out.println(a.a);
		
		NonStaticVariable b = new NonStaticVariable();
		b.a=20;
		
		NonStaticVariable c = new NonStaticVariable();
		c.a = 50;
		
		System.out.println(a.a); // 12
		System.out.println(b.a);//20
		System.out.println(c.a);//50
	}
}
