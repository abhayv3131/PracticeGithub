package Abstract;

public class Test4 extends Test3{

	public void m4() {
		System.out.println("implementing m4");
	}
	
	public static void main(String[] args) {
		Test4 objChild = new Test4();
		
		objChild.m1();
		objChild.m2();
		objChild.m3();
		objChild.m4();
		objChild.m5();
		
		Test4 t1 = new Test4();
		t1.m1();
		t1.m5();
		
		m123();
		
		
	}
	
}
