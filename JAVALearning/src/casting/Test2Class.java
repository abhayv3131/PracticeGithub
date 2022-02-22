package casting;

public class Test2Class extends Test1Class {

	public void m2() {
		System.out.println("m2 is child method");
	}
	
	public static void main(String[] args) {
		
		Test1Class parentObj= new Test1Class();
		parentObj.m1();
		
		
		Test2Class childObj = (Test2Class)parentObj;
		childObj.m1();
		childObj.m2();
	}
}
