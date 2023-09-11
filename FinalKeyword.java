package finalKeyword;

public class FinalKeyword {
public static void main(String[] args) {
		
		FinalKeyword f=new FinalKeyword();
		f.m1();
		f.m2(50);
		f.final_keyword();
	}

	
	public void m1() {
		final int x=30;         //final keyword to local variable
		System.out.println(x + " : final to local variable");
		
	}
	
	public  void m2(final int y) {//final keyword to method parameter
		
		System.out.println(y + " : final in a method parameter");
	}
	
	int x;
	public void final_keyword() {
		//regular case
		FinalKeyword f=new FinalKeyword();
		f.x=100;
		FinalKeyword f1=new FinalKeyword();
		f1.x=200;
		f=f1;
		System.out.println(f.x);  //200
		System.out.println(f1.x); //200
		
		//using final class object
	    FinalKeyword ff=new FinalKeyword(); //using final class object
		ff.x=100;
		ff.x=500;
		FinalKeyword ff1=new FinalKeyword();
		ff1.x=200;
		ff=ff1;                   //cannot change it and make it equal    
		System.out.println(ff.x);  //500 it will take recent value not earlier one as 100
		System.out.println(ff1.x); //200
		
		
		
	}
	
	
}
