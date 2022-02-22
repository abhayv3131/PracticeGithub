package constructorRelationwithInheritance;

public class ChildClassConIN extends ParentClassConIn {
	
	
	
	public ChildClassConIN() {
		super(25);
		System.out.println("this is child class constructor");
	}
	
	
	public static void main(String[] args) {
		
		ChildClassConIN chObj= new ChildClassConIN();
		
	}

}
