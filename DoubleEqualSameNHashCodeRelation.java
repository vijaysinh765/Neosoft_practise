package langPackage;

public class DoubleEqualSameNHashCodeRelation {
	
	int i;
	
	public DoubleEqualSameNHashCodeRelation(int i) {this.i=i;}
	
	public int hashCode() {return i;}
	
	public String toString() {return i+"";}
	
	public static void main(String[] args) {
		
		DoubleEqualSameNHashCodeRelation d1=new DoubleEqualSameNHashCodeRelation(10);
		DoubleEqualSameNHashCodeRelation d2=d1;
		
		System.out.println(d1);//10
		System.out.println(d2);//10
		System.out.println(d1==d2);//true--------------------------==Operator
		
		System.out.println(d1.hashCode());//10
		System.out.println(d2.hashCode());//10
		
		System.out.println(d1.equals(d2));//true--------------------equals()Method
		System.out.println(d1.hashCode()==d1.hashCode());//true-----hashCode method
		//If 2 objects are equal by == operator then their hash codes must be same.(valid)
	}

}
