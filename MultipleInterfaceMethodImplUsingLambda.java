package jdk8;

interface L{void m1();}

interface R{void m1(int i);}

interface M{ int m2(int a,int b);}

public class MultipleInterfaceMethodImplUsingLambda {
	public static void main(String[] args) {
		
		L l=()->{System.out.println("L method m1()");};
		l.m1();
		
		R r=(int i)->{System.out.println("R method m1() : "+i);};
		r.m1(10);
		
		M m=(int a,int b)->{ return a+b; };
		int x=m.m2(90, 80);
		System.out.println("addition :"+x);
	}

}
