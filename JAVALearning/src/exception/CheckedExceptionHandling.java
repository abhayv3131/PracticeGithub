package exception;

public class CheckedExceptionHandling {

	
	public static void main(String[] args) throws InterruptedException    {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		Thread.sleep(2000);      ////interrupted exception is handle using throws
		
		System.out.println(4);
	   System.out.println(5);
	}
}
