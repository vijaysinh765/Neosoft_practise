package interview_preparation;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInAGivenString {
public static void main(String[] args) {
	
		String str="NeosoftTechnology";
		     
		char ch[]=str.toCharArray();
		
		Map<Character,Integer> mp=new HashMap<>();
		
		for( char c:ch) {   
			
			if(mp.containsKey(c)) {
				
				mp.put(c,mp.get(c)+1 );	
				
			}else {
				
				mp.put(c, 1);
			}
			
				
		}
		System.out.println(mp);
		
	}
}

