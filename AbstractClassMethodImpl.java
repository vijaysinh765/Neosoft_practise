package abstractClass;

abstract class Aa{
	
	public void m1() {System.out.println("class A :m1()");};
	public abstract void m2();
	public abstract void m3();
}

abstract class Bb extends Aa{
	
	public void m2() {System.out.println("class B :m2()");}
}

class Cc extends Bb{
	
	public void m3() {System.out.println("class C : m3()");}
	
}

public class AbstractClassMethodImpl {
	public static void main(String[] args) {
		
		Cc c=new Cc();
		c.m3();
		c.m2();
		c.m1();
		Bb b=new Cc();
		b.m2();
		b.m1();
		b.m3();
		Aa a=new Cc();
		a.m1();
		a.m3();
		
		
	}

}
