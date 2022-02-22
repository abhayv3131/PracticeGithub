package exception;

import java.util.Scanner;

public class CustomizedException {

	public void m1(int marks)
	
	{
		if(marks<=40)
			throw new IllegalArgumentException ("Failed");
		else
			System.out.println("Passed");
	}
	
	public static void main(String[] args) {
		CustomizedException customizedException= new CustomizedException();
		
		Scanner	scn = new Scanner(System.in);
		
		int markkks = scn.nextInt();
		
		customizedException.m1(markkks);
	}	
}
