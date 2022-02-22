package timepass;

public class SarswatiVidyalay {
	static int outOf = 100;
	int maths;
	int physics;
	int chemistry;
	
	public static void main(String[] args) {
		SarswatiVidyalay raju = new SarswatiVidyalay();
		SarswatiVidyalay avdhut = new SarswatiVidyalay();
		SarswatiVidyalay arun = new SarswatiVidyalay();
		
		raju.maths = 60;
		raju.physics = 80;
		raju.chemistry = 67;
		
		avdhut.maths = 40;
		avdhut.physics = 60;
		avdhut.chemistry = 80; 
		
		arun.maths = 41;
		arun.physics = 65;
		arun.chemistry = 85;
		
		System.out.println("Marks of arun maths: " +arun.maths);
		System.out.println("Marks of arun physics: " +arun.physics);
		System.out.println("Marks of arun chemistry: " +arun.chemistry);
		System.out.println("Marks of raju maths: " +raju.maths);
		System.out.println("Marks of raju physics: " +raju.physics);
		System.out.println("Marks of raju chemistry: " +raju.chemistry);
		System.out.println("Marks of avdhut maths: " +avdhut.maths);
		System.out.println("Marks of avdhut physics: " +avdhut.physics);
		System.out.println("Marks of avdhut chemistry: " +avdhut.chemistry);
	}
}
