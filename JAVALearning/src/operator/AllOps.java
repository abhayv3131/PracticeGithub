package operator;

public class AllOps {

public static void main(String[] args) {
	
	int x = 20;
	int y = 30;
	
	if(x==y)
	{
		System.out.println("yes it is equal");
	}
	
	if(x!=y)
	{
		System.out.println("yes it is not equal");
	}
	
	if(!(x>y))
	{
		System.out.println("x is not equal to y");
	}
	
if ((x>y)&&(y==30)) {
	System.out.println("both condition should get satisfy");
}

if ((x>y)||(y==30)) {
	System.out.println("Any one of the condition should get satisfy");
}

}
}

