package oops;

interface I1{ void m1();void m11();}

interface I2 extends I1{void m2();void m11();}

interface I3 extends I2,I1{void m3();}

public class ClassImplementingMultipleInterfacesAbstraction implements I1,I2,I3{

	public void m1() {System.out.println("interface i1");}
	
	public void m2() {System.out.println("interface i2");}
	
	public void m3() {System.out.println("interface i3");}
	
	public void m11() {System.out.println("inerface i1 method m11");}
	
	//public void m11() {System.out.println("inerface i1 method m11");}
	
	public static void main(String[] args) {
		I1 i1=new ClassImplementingMultipleInterfacesAbstraction();
		System.out.println("interface i1 method calling");
		i1.m1();
		i1.m11();
		
		
		I2 i2=new ClassImplementingMultipleInterfacesAbstraction();
		System.out.println("interface i2 method calling");
		i2.m2();
		i2.m1();
		i2.m11();
		
		I3 i3=new ClassImplementingMultipleInterfacesAbstraction();
		System.out.println("interface i3 method calling");
		i3.m3();
		i3.m2();
		i3.m1();
		
	}
	

}
