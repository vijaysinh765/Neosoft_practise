package oops;

public class OverridingToStringMethod {
	
	private  int rollno;
	private String name;
	
	public OverridingToStringMethod( int hajerikramank,String nav) {
		
		this.rollno=hajerikramank;
		this.name=nav;	
	}
	


	
	public static void main(String[] args) {
		 
		OverridingToStringMethod o=new OverridingToStringMethod(10,"vijay");
		OverridingToStringMethod o1=new OverridingToStringMethod(20,"mane");
		System.out.println(o);
		System.out.println(o1);
		

	}

}
