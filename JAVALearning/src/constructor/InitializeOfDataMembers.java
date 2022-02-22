package constructor;

public class InitializeOfDataMembers {

	
	
	 int a;
	 int b;
	 int c; 
	
	public InitializeOfDataMembers(int a, int b, int c) {
	 	
		this.a=a;
		this.b=b;
		this.c=c;
	}

	
	public static void main(String[] args) {
		InitializeOfDataMembers obj = new InitializeOfDataMembers(10,20,30);
	} 
	}
