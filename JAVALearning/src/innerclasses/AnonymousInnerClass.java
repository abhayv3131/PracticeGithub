package innerclasses;
////Anonymous inner classes/////

class AnonymosInnerClass {

	interface InterFace {
	    void unImplemented();
	}
	
    // An anonymous class that implements interface
    static InterFace interFaceObj = new InterFace() {
        public void unImplemented() {
            System.out.println("i am in anonymous class implented method");
        }
    };
  
    public static void main(String[] args) {
    	interFaceObj.unImplemented();
    }
}
  
