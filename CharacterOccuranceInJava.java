package interviewMostRepeating;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterOccuranceInJava {
	public static void main(String[] args) {
		
		String s="helloworld";
		char ch[]=s.toCharArray();
		
		Map<Character,Integer>m=new HashMap<>();
		
		for( char c:ch) {
		if(m.containsKey(c)) 
		{m.put(c,m.get(c)+1);
		
		Set<Character> keys=m.keySet();
		
		for( Character key:keys) {
			
			Integer i =m.get(key);
			System.out.println("Repeatating characters is"+ keys+"repeating"+i+"times");
			
		}
		
		
		
		
		}
		
		else {  m.put(c, 1);}
		
		}
		System.out.println(m);
		
		
			

	}}
