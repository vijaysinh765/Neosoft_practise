package exceptionHandling;

public class AgeInvalidException extends Exception{
	
	public AgeInvalidException(String s) {
		super(s);
		System.out.println("Exception constructor");
		
	}

}
