package abstractClass;

public class ABTest {
public static void main(String[] args) {
	A a=new B();
	a.m1();
	a.m2();
	//a.m4(); Parent class cannot access child class methods
	B b=new B();
	b.m4();
	b.m1();
	b.m2();//child class can access all parent class methods
}
}
