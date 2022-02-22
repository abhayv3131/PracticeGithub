package stringmethods;

public class MethodOfString4 {

	
	public static void main(String[] args) {
		
		String s = "abcdefghi";
		
		char[] outputofCharyArraymethod = s.toCharArray();
		
		for(int i = 0; i<outputofCharyArraymethod.length;i++)
		{
			System.out.println(outputofCharyArraymethod[i]);
		}
		
		String s1 = "Abcxy cdWer";
		    String[] outputofSplit = s1.split("\\s");
		    
		    for(String pa:outputofSplit)   	
		    {
		    	System.out.println(pa);
		    }
		    
		    boolean check = s1.isBlank();
	        System.out.println(check);
	
	        
	        String ss = "avdhut1";
	        
	        char check1 = ss.charAt(6);
	        System.out.println(Character.isDigit(check1));
	        
	        
	
	}
}
