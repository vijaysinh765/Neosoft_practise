package langPackage;

public class EqualsUse {
	
	String name;
	int rollno; 
	
	EqualsUse(String name,int rollno){
		
		this.name=name;
		this.rollno=rollno;	
	}
	
	public static void main(String[] args) {
		
		EqualsUse e1=new EqualsUse("vijay",101);
		EqualsUse e2=new EqualsUse("ravi",102);
		EqualsUse e3=new EqualsUse("vijay",101);
		EqualsUse e4=e1;
		
		System.out.println(e1.equals(e2));//false
		System.out.println(e1.equals(e3));//false
		System.out.println(e1.equals(e4));//true
		
	}
	

}

//In the above program Object class .equals() method got executed which is always 
//meant for reference comparison that is if two references pointing to the same 
//object then only .equals(() method returns true
