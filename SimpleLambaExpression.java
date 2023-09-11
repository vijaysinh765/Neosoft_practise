package jdk8;


interface I{
	void m1(int a);
}

public class SimpleLambaExpression {
	public static void main(String[] args) {
		
		I i=(int a)->{System.out.println("m1 method implementation :"+a);};
		  i.m1(10);
	}

}
