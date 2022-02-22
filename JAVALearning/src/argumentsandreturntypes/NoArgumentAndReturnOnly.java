package argumentsandreturntypes;

public class NoArgumentAndReturnOnly {

	
	public boolean noArgWithReturn() {
		
		return true;
			 
	}
	
	public static void main(String[] args) {
		NoArgumentAndReturnOnly arg = new NoArgumentAndReturnOnly();
		System.out.println(arg.noArgWithReturn());
	}	
}
