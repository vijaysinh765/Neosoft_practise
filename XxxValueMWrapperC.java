package langPackage;

public class XxxValueMWrapperC {
	
	//wrapper object to primitive
	public static void main(String[] args)throws Exception {
		Integer i=new Integer(130);
		System.out.println(i.byteValue());//-126
		System.out.println(i.shortValue());//130
		System.out.println(i.intValue());//130
		System.out.println(i.longValue());//130
		System.out.println(i.floatValue());//130.0
		System.out.println(i.doubleValue());//130.0
		}

}
