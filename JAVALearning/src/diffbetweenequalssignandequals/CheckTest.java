package diffbetweenequalssignandequals;

public class CheckTest {

	public static void main(String[] args) {

		String a = "avdhut";
		String b = "avdhut";
		String c = new String("avdhut");
		
		System.out.println(a==c);
		// == operator indicates the address of memory where content is stored
		
		System.out.println(a.equals(c));
		// .equals method indicates the comparison on content of that object
	}
}
