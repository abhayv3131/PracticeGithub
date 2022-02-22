package polymorphism;

public class OverLoading2 extends OverLoading1 {
	
	
	
public void m1(int a, boolean k, int d) {
	System.out.println("child m1 running");	

}


public static void main(String[] args) {
	
	OverLoading1 childObj = new OverLoading2(); 
	//jiska ref hey uska method compiler suggest karega n wahi chalega in overloading
	
	
	
}
}
