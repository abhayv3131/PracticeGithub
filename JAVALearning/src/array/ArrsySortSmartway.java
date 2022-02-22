package array;

import java.util.Arrays;

public class ArrsySortSmartway {

	
	public static void main(String[] args) {
		
		int[] a= {105,200,45,81,1,545,1,478,65,448,568,48,26,487,48,88825,4,14,45,8,7,8,9,45};
		
		Arrays.sort(a);  //asecend the array
		
		for(int i =0; i<a.length;i++)
		System.out.print(a[i] + " ");	
	}
}
