package argumentsandreturntypes;

public class ArgumentAndNoReturn {

	
	public void argButNoReturn(int a, int b)
	{
		int c= a+b;
		
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		ArgumentAndNoReturn arg = new ArgumentAndNoReturn();
		arg.argButNoReturn(50, 50);
	}
}
