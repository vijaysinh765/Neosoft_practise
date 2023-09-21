package langPackage;

public class ToStringOverriding {
	
	
	public String toString()
	{
		return "ToStringOverriding class";
		
	}
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		String s =new String("vijay");
		ToStringOverriding t=new ToStringOverriding();
		System.out.println(i);
		System.out.println(s);
		System.out.println(t);
	}

}

//output:
//	10
//	vijay
//	ToStringOverriding class
//
//In String class, StringBuffer, StringBuilder, wrapper classes and in all collection 
//classes toString() method is overridden for meaningful string representation.

