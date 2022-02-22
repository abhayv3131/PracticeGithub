package array;

public class ArrayExampleProgrm {

	//write program to reverse this array///
	
	public static void main(String[] args) {
		int[] a= {200,105,45,81,1,545,478,65,448,568,48,26,487,48,88825,4,14,45,8,7,8,9,45};
	
		//printing of given array
		System.out.println("before reversing");
		for(int i = 0; i<=a.length-1;i++)
		System.out.print(a[i] + " ");
		
		//reversing logic of array
		System.out.println();
		System.out.println("after reversing");
		for(int i = a.length-1; i>=0; i--)  // reverse
			System.out.print(a[i] + " ");
		
	}
}
