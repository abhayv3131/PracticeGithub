package innerclasses;

///Method Local Inner Class/////
public class MethodLocalInnerClass {

	
	void outerMethod() {
		final int x = 100;
		System.out.println("outermethod in");
		
		class Inner {
			void innerMethod() {
				System.out.println("innermethod in");
				System.out.println(x);
			}
		}
		 Inner inA = new Inner();
		 inA.innerMethod();
	}
}
	
	class Demo{
		public static void main(String[] args) {
			MethodLocalInnerClass outA= new MethodLocalInnerClass();
			
		outA.outerMethod();
		}
	}

