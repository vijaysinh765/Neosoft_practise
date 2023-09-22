package langPackage;

public class DiffHashCodeNEqualsCorelation {
	
	int i;
	
	DiffHashCodeNEqualsCorelation(int i ){
		this.i=i;
	}
	
	public int hashCode() {return i;}
	
	public String toString() {return i+"";}
	
	public static void main(String[] args) {
		
		DiffHashCodeNEqualsCorelation d1=new DiffHashCodeNEqualsCorelation(10);
		DiffHashCodeNEqualsCorelation d2=new DiffHashCodeNEqualsCorelation(20);
		
		System.out.println(d1);//10
		System.out.println(d2);//20
		System.out.println(d1.hashCode()==d2.hashCode());//false
		System.out.println(d1.equals(d2));//false
		//If hash Codes of 2 objects are not equal then .equals() method always return false.(valid)
		
		
	}
	
	

}
