package stringBasic;

public class StringImutabilityCheck1 {

	
	
	static String abc = "avdhut";    /// String is by default final and Immutable 
	
	
	public static void main(String[] args) {
		
		abc = "pawar";   
		
		/// because upon changing the string object content it will always create new object 
		// it will not update or change the previous object content 
	}
}
