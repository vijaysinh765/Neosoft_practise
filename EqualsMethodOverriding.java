package langPackage;

public class EqualsMethodOverriding {

	String name;
	int rollno; 
	
	EqualsMethodOverriding(String name,int rollno){
		
		this.name=name;
		this.rollno=rollno;	
	}
	
	public boolean equals (Object obj) {
	
		try {
		String name1=this.name;
		int rollno1=this.rollno;
		
		EqualsMethodOverriding ee=(EqualsMethodOverriding)obj;
		String name2=ee.name;
		int rollno2=ee.rollno;
		
		if(name1.equals(name2) && rollno1==rollno2) {return true;}
		else return false;		
		}
		
		catch(ClassCastException e) {return false;}
		catch(NullPointerException e) {return false;}
		
	}
	
	public static void main(String[] args) {
		
	EqualsMethodOverriding e1=new EqualsMethodOverriding("vijay",101);
	EqualsMethodOverriding e2=new EqualsMethodOverriding("ravi",102);
	EqualsMethodOverriding e3=new EqualsMethodOverriding("vijay",101);
	EqualsMethodOverriding e4=e1;
		
		System.out.println(e1.equals(e2));//false
		System.out.println(e1.equals(e3));//false
		System.out.println(e1.equals(e4));//true
		System.out.println(e1.equals("vijay"));//false
		System.out.println(e1.equals("null"));//false
		
	}
}
// When ever we are overriding .equals() method we have to consider the following 
//things :
//1. Meaning of content comparison i.e., whether we have to check the names 
//are equal (or) roll numbers (or) both are equal.
//2. If we are passing different type of objects (heterogeneous object) our 
//.equals() method should return false but not ClassCastException i.e., we 
//have to handle ClassCastException to return false.
//3. If we are passing null argument our .equals() method should return false 
//but not NullPointerException i.e., we have to handle 
//NullPointerException to return false.
