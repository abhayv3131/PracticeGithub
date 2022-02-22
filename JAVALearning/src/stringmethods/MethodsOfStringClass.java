package stringmethods;

public class MethodsOfStringClass {

	public static void main(String[] args) {

		String s = "abc";

		char returningChar = s.charAt(0);
		System.out.println("charAt index output: " + returningChar);

		String s2 = "def";
		String returningOfConcat = s.concat(s2);
		System.out.println("concate output: " + returningOfConcat);
		
		boolean retruningEquals= s.equals(s2);
		System.out.println("equals output: " + retruningEquals);
		
	}
}
