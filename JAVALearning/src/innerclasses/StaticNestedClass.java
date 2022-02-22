package innerclasses;

/////Static Nested Inner Class////
public class StaticNestedClass {

	static void outerMethod() {
		System.out.println("outerMethod in");
	}
	
	static class inner{
		public static void main(String[] args) {
			System.out.println("innerClass- Static");
			
			outerMethod();
		}	
		
	}
}
