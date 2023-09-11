package exceptionHandling;

public class UncheckedException {
	public static void main(String[] args) {
		
		
		ArithmeticException();
		NullPointerException();
		NumberFormatException();
		ArrayIndexOutOfBoundException();
		
		
		//int a= 10/0;          //ArithmeticException
//	String str=null;            //NullPointerException
//	int length=str.length();
//	System.out.println(length);
	
//		int b= Integer.parseInt("a");//NumberFormatException
	//	String s=args[0];     //ArrayIndexOutOfBoundException
		
		}
	
	public static void ArithmeticException()  {
	try {int a= 10/0; }
	  catch(ArithmeticException e) {	System.out.println("ArithmeticException handled");}
		}
		
	public static void NullPointerException() {
	try {String str=null;            //NullPointerException
		int length=str.length();
		System.out.println(length);}
	   catch(NullPointerException e) {System.out.println("NullPointerException handled");}
		
		}
	
	public static void NumberFormatException()  {
	try {String invalidNumber = "abc123";
		 int parsedNumber = Integer.parseInt(invalidNumber);
         System.out.println("Parsed number: " + parsedNumber);}
		catch(NumberFormatException e){ System.out.println("NumberFormatException handled");}
		 
        }
	
	public static void ArrayIndexOutOfBoundException()  {
		try {int[] numbers = { 10, 20, 30, 40, 50 };
		int value = numbers[10];
		System.out.println("Value at index " + 10 + ": " + value);}
		catch(ArrayIndexOutOfBoundsException e) { System.out.println("ArrayIndexOutOfBoundsException handled");}
	
	}
     
	  
}
