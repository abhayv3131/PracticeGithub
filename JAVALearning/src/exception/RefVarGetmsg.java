package exception;

public class RefVarGetmsg {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(5/0);	
		}
		
		catch(ArithmeticException msg) {
			System.out.println("Exception Reason " + msg.getMessage());
		}
		System.out.println(3);
		System.out.println(4);
		
	}
}
	

