package breakandcontinue;

public class LabellingOfLoopWithBreak {

	public static void main(String[] args) {
		
	outerLoop:	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<5;j++) {
				
				if(j==2)
					break outerLoop;
			System.out.println("inner Loop :" + j);
			}
		
		}
	}
	
}

