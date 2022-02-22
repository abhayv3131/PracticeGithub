package array;

import java.util.Arrays;

public class ArrayComparision {

	
	//Write a progrm to compare Arrays if two arrays are same then print boolean output///
	
	
public static void main(String[] args) {
	
	int[] a = {1,2,3,4,100};
	int[] b = {4,5,6,7};
	int[] c = {1,2,3,4,10};
	
	System.out.println(Arrays.equals(a, b));   ///false
	System.out.println(Arrays.equals(b, c));   // false
	System.out.println(Arrays.equals(a, c));   /// true
}	
}
