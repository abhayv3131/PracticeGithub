package stringmethods;

public class MethodsOfString3 {

	public static void main(String[] args) {

		String s = "123456abcdef";

		int outPutofLength = s.length();
		System.out.println("Output of length() method: " + outPutofLength);

		String s1 = "ababa";

		String outputofReplace = s1.replace('a', 'b');
		System.out.println("output Of replace : " + outputofReplace);

		String s2 = "AB1FDD";

		String outputOfLowercase = s2.toLowerCase();
		System.out.println("output of toLowercase: " + outputOfLowercase);

		String outputOfUpperCase = outputOfLowercase.toUpperCase();
		System.out.println("output of Upper case method: " + outputOfUpperCase);

		String s3 = "     value     ";
		String outputOfTrim = s3.trim();
		System.out.println("output of trim: " + outputOfTrim);

		String s4 = "abcdefa";
		int outPutOfIndexOf = s4.indexOf("f");
		System.out.println("output of indexOF: " + outPutOfIndexOf);

		String s5 = "bbbbd";
		int outofLastIndexof = s5.lastIndexOf("b");
		System.out.println("output of last indexOf: " + outofLastIndexof);

		String s6 = "abcdefg";

		boolean outputofContains = s6.contains("def");
		System.out.println("output of contains: " + outputofContains);

	}
}
