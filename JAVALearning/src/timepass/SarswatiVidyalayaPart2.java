package timepass;

public class SarswatiVidyalayaPart2 {
	
	int maths;
	int chem;
	int phy;
	
	public void generalize(int maths, int chem,int phy) {
		
		this.maths = maths;
		this.chem  = chem;
		this.phy   = phy;
		
		System.out.println("Marks of Student: ");
		System.out.println("Maths :"  +maths);
		System.out.println("chem  :"  +chem);
		System.out.println("phy   :"  +phy);
	}
	
	public void avdhut() {
		generalize(80,90,100);
	}
	
	public void aadesh() {
		generalize(10,20,10);
	}
	
	public void seema() {
		generalize(100,90,99);
	}
	
	public static void main(String[] args) {
		SarswatiVidyalayaPart2 m1 = new SarswatiVidyalayaPart2();
		SarswatiVidyalayaPart2 m2 = new SarswatiVidyalayaPart2();
		SarswatiVidyalayaPart2 m3 = new SarswatiVidyalayaPart2();
		
		m1.avdhut();
	}
}
