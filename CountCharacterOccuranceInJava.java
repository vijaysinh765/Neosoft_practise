package interviewMostRepeating;

public class CountCharacterOccuranceInJava {
	public static void main(String[] args) {
		String s="aaaabbbcccccc";
		int count=0;
		int a =s.length();
		System.out.println(a);
		for(int i=0;i<=a;i++) {
	Character a1=s.charAt(i);
	
	Character a2=s.charAt(i+1);
	if (a1==a2) {
		count++;
		
	}
	
//	else {System.out.println(a1 + "is non repeatating"+count ++);}
//		System.out.println(s.charAt(i));
//	}

}}}//System.out.println(a1  +  " : occured :"+count  + "times");}}
