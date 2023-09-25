package langPackage;

public class DeepCloningBasic implements Cloneable {
	
	int i=10;
	int j=20;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		DeepCloningBasic d1=new DeepCloningBasic();
		DeepCloningBasic d2=(DeepCloningBasic) d1.clone();
		
		d2.i=100;
	    d2.j=200;
		
		System.out.println("i = "+ d1.i + " ; j ="+ d1.j );
		
		System.out.println("i1 ="+d2.i +";j1 ="+d2.j );
		
		
	}
	
	

}
