package stringBasic;

public class StringIntro {

	 String abc = "hotel";
	
	
	public static void main(String[] args) {

		String a = "avdhut";

		///////////////////////////////////////////////////////
		a = "pawar";
		////////////////////////////////////////////////////////////////

		////// -----------------------is der any ref var available to the object avdhut?
		////// ----------------------- No
		////// ----------------------- this object will be consider for garbage
		////// collection

		System.out.println(a); /////

		a = "avdhut";
        String b = "pawar";
       
       
	}

}