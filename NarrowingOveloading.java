package oops;

public class NarrowingOveloading {
	
	public void m1(Object o) {System.out.println("object-parent class parameter");}
	
	public void m1(String s) {System.out.println("string-child class parameter");}
	
	public void m1(int s) {System.out.println("integer-child class parameter");}

	public static void main(String[] args) {
		
		NarrowingOveloading n=new NarrowingOveloading();
	    n.m1("abc");
		n.m1((Object )"xyz");
		n.m1(10);
	}
	
	
	
	

}
