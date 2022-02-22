package exception;

public class UncheckedExceptionHandling {

	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(100/0);  ////unexpected event 
		}
		
		catch(ArithmeticException messege)
		{
			System.out.println("here is the exception bcuz divied by zero");
		}
		
		finally {
			System.out.println("finally will always run");
		}

        System.out.println(4);
        System.out.println(5);
	}
	
}
