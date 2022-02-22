package inheritance;

public class ChildClass extends ParentClass {

	int a = 50; ///////////// non static var in child
	static int b = 60; ////// static var in child



	public static void main(String[] args) {
		ChildClass vr = new ChildClass();
		System.out.println(vr.a);

	}
}
