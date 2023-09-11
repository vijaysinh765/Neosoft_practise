package inheritance;

class Parent{
	public void m1() {System.out.println("parent class ");}
	public void m2() {System.out.println("parent class m2");}
		
}

class Child1 extends Parent{
	public void m1() {System.out.println("child1 class");}
	public void m3() {System.out.println("child1 class m3()");}
}

class Child2 extends Parent{
	public void m4() {System.out.println("child2 class  ");}
	
}

public class ParentReference {
	public static void main(String[] args) {
		Parent p= new Child1();
		p.m1();//overrides inheritance.Parent.m1
		p.m2();//method in parent class is called
		       //p.m3(); cannot call it but possible in abstract class
		
		Child1 c=new Child1();
		c.m1();//child class

	}

}
