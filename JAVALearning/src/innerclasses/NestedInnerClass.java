package innerclasses;

////Nested Inner Class/////
public class NestedInnerClass {

	class Abc{
		private int a = 12;
		public void m1() {
			System.out.println("Nested Inner Class");
		System.out.println(a);
		Abc pri = new Abc();
		pri.a = 15;
		System.out.println(pri.a);
		}
		
	}	
}

class Main{
	public static void main(String[] args) {
		NestedInnerClass.Abc	in = new NestedInnerClass().new Abc();
		in.m1();
	}
}
