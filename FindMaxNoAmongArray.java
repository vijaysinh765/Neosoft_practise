package interviewMostRepeating;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxNoAmongArray {
public static void main(String[] args) {
	
	int i[]= {5,6,7,8,9,10};
	
	Arrays.sort(i);
	int f=i.length;
	System.out.println(f);
	Array.get(i, 0);
	System.out.println(	Array.get(i, 0));

//	for(int i1:i) {
//	System.out.println(i1);}
	
	// using collections sort
	List<Integer> l=Arrays.asList(5,6,7,8,9,10);
	System.out.println(l.size());
	
	Collections.sort(l);
	
	System.out.println("max no:" +l.get(5));
	System.out.println("min no:" +l.get(0));
	
	//using jdk 8 features
	
	List<Integer> l1=Arrays.asList(5,6,7,8,9,10);
	
	long s=l.stream().max((s1,s2)->s1.compareTo(s2)).get();
	long x=l.stream().min((s1,s2)->s1.compareTo(s2)).get();
	System.out.println("max no:"+s);
	System.out.println("min no:"+x);
	
	
	
	
		
}}

//
