package polymorphism;

public class Narrowing {
	
	public void methodOne(Object o) //Both methods are said to be overloaded methods.
	 {
	System.out.println("Object version");
	}
	
	public void methodOne(String s)
	{
	System.out.println("String version");
	}
	
	
	
	public static void main(String[] args)
	{
		Narrowing t=new Narrowing();
	t.methodOne("arun");//String version
	t.methodOne(new Object());//Object version
	t.methodOne(null);//String version
	}
	

}
