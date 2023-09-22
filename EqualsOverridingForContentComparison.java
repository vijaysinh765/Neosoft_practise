package langPackage;

public class EqualsOverridingForContentComparison {
	
	public static void main(String[] args) {
		
		String s1 = new String("ashok");
		String s2 = new String("ashok");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2) ); 	//true
	
		StringBuffer s3 = new StringBuffer("ashok");
		StringBuffer s4 = new StringBuffer("ashok");
		System.out.println(s3==s4); //false
		System.out.println(s3.equals(s4) ); 	//false
		
//	    In String class , Wrapper classes and all collection classes .equals( ) method is 
//		overridden for content comparison
			
	}

}
