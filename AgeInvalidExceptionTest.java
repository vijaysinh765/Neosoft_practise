package exceptionHandling;

public class AgeInvalidExceptionTest {

	public  void votingage(int age) throws AgeInvalidException {
		if(age<18) {
			throw new AgeInvalidException("Invalid voter because age is less than 18");
			//System.out.println("Age less than 18-invalid voter");--unreachable code
		}
		else if(age>60) {
			throw new AgeInvalidException("Invalid voter because age is more than 60");
			//System.out.println("Over aged citizen-invalid voter");--unreachable code
		}
		else{
			System.out.println("valid voter");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			AgeInvalidExceptionTest t=new AgeInvalidExceptionTest();
		    t.votingage(13);
	}
		catch(AgeInvalidException a) {
			
			
			System.out.println("Exception caught");
			System.out.println("Exception occured :"+a);
		
		}
		
		System.out.println("Remaining code");
		}
}
