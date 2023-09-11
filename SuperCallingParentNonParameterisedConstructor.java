package superAndThis;

 class A11{
	
     public A11() {System.out.println("parent A non parameterised constuctor");}
		
}
 
 class B11 extends A11{
	 public B11() {System.out.println("child B non parameterised constructor");}
	 
 }

public class SuperCallingParentNonParameterisedConstructor {
	public static void main(String[] args) {
		
		B11 b=new B11();
		
	}

}
