package langPackage;



class GetClassMethod implements Cloneable {
public static void main(String[] args)throws CloneNotSupportedException {
	
Object o=new String("ashok");
System.out.println("Runtime object type of o is :"+o.getClass().getName());
}
}
//Output:
//Runtime object type of o is: java.lang. String
//Ex : To print Connecton interface implemented vendor specific class name . 
//System.out.println(con.getClass( ).getName( ) );
