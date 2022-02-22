package breakandcontinue;

public class BreakKeyword {

	
	public static void main(String[] args) {
		
		for(int i =0; i<=5;i++)
		{
			if(i==4)
			{
				break;
			}
			System.out.println("value of :" + i);
		}
		
		System.out.println("out from loop");
		
	}
	
}
