package timepass;

public class SarswatiVidyalaya {

	int maths;
	int chem;
	int phy;
	
	public SarswatiVidyalaya(int maths, int chem, int phy) {
		
		this.maths = maths;
		this.chem = chem;
		this.phy = phy;
	}
	
	public void m1() {
		System.out.println("Maths :" + maths);
		System.out.println("chem: " + chem);
		System.out.println("phy :" + phy);
	}
	
	public static void main(String[] args) {
		SarswatiVidyalaya Tina = new SarswatiVidyalaya(00,5,6);
		SarswatiVidyalaya Meena = new SarswatiVidyalaya(10,5,6);
		SarswatiVidyalaya Avdhut = new SarswatiVidyalaya(100,50,60);
		
		Avdhut.m1();
		System.out.println(Avdhut.maths + Avdhut.phy+ Avdhut.chem);	
	
		Tina.m1();
		System.out.println(Tina.maths+Tina.phy+Tina.chem);
		
	}
	
	
}
