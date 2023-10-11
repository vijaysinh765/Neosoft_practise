package langPackage;

public class ValueOfMWrapperC {
	
	//String/primitive to wrapper object
	
	public static void main(String[] args)throws Exception {
		Integer i=Integer.valueOf(10);
		Double d=Double.valueOf(10.5);
		Boolean b=Boolean.valueOf(true);
		Character ch=Character.valueOf('a');
		System.out.println(ch); //a
		System.out.println(i);//10
		System.out.println(d);//10.5
		System.out.println(b);//true
		}

}
