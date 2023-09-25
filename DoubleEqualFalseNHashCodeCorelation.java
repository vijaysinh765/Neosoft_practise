package langPackage;

public class DoubleEqualFalseNHashCodeCorelation {
	
	int i;
	
	public DoubleEqualFalseNHashCodeCorelation(int i) { this.i=i;}
	
	//public int hashCode() {return i;}
	
	public String toString() {return i+"";}
	
	public static void main(String[] args) {
		
		DoubleEqualFalseNHashCodeCorelation d1=new DoubleEqualFalseNHashCodeCorelation(10);
		DoubleEqualFalseNHashCodeCorelation d2=new DoubleEqualFalseNHashCodeCorelation(10);
		
		System.out.println(d1.hashCode());//  305808283 10
		System.out.println(d2.hashCode());//  405662939 10
		System.out.println(d1.hashCode()==d2.hashCode());//false
		
		//. If == operator returns false then their hash codes(may be same (or) may be 
		//different) must be different.(invalid)
		
		//If hashcodes of 2 objects are equal then these objects are always equal by == operator also.(invalid)
		
		
	}

}
