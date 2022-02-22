package stringmethods;

public class MethodsOfStrings2 {

	public static void main(String[] args) {

		String s = "abc";
		String s1 = "ABC";

		boolean methodCheck = s.equalsIgnoreCase(s1);
		System.out.println("equalsIgnore Out:" + methodCheck);
		
		
		String s2 = "abcDDLJ";
		
		  String subStringoutput = s2.substring(3);
		  System.out.println("substring output: "+ subStringoutput);
		  
		   String outputOfSubstringBeginandEndIndex = s2.substring(2, 5);
		System.out.println("Substring begin and end index output: " + outputOfSubstringBeginandEndIndex);
	}
}
