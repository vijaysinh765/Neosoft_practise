package interviewMostRepeating;

public class CountDuplicatesCharactersAmongString {
	public static void main(String[] args) {
		
		String s="cccbbbaaax";
		int count=0;
		for(int i=0;i<s.length();i++) {
		Character a=s.charAt(i);
		for(int j=i+1;j<s.length();j++) {
		Character b=s.charAt(j);
        if(a==b) {
			System.out.println("Repeatating character is "+a );
			
			}
		}}
		
		//using toCharArray method
		
		char c[]=s.toCharArray();
		
		
	
	
	
	}}
