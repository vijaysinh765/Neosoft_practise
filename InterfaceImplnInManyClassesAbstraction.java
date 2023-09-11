package oops;


interface I{
	
	void m1();//default it is public abstract
	
}

class A implements I {
	
	public void m1() {System.out.println("class A");}
}

class B implements I{
	
	public void m1() {System.out.println("class B");}
}

public class InterfaceImplnInManyClassesAbstraction {
	
	public static void main(String[] args) {
		
		I i=new A();
		i.m1();
		I i1=new B();
		i1.m1();
	}
	

}
