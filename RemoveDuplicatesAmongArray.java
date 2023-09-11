package interviewMostRepeating;

import java.util.HashSet;

public class RemoveDuplicatesAmongArray {
	public static void main(String[] args) {
		
		int a[]= {10,30,40,50,20,10,60,20,30,40,50,60};
		
	
		HashSet <Integer>hs =new HashSet<>();
		for(int i=0;i<a.length;i++) {
			
			hs.add(a[i]);
		}
		System.out.println(hs);
       // hs.stream().forEach(s->System.out.println(s));

}
}