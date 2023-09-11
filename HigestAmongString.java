package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HigestAmongString {
public static void main(String[] args) {
	int i[]= {5,6,7,8,9,2,4,3,3,88};
	Array.setInt(i, 3, 99);
	Arrays.sort(i);
	int a=Array.getLength(i);
	System.out.println("Length of array:" +Array.getLength(i));  //length of array
	Array.get(i, a-1);
	System.out.println("Highest number among array elements:"+Array.get(i, a-1)); // highest element among array
	System.out.println("2 nd Highest number among array elements:"+Array.get(i, a-2)); //2nd highest element among array

	
	//distinct/non repeatating number among array
	
	List<Integer>l=Arrays.asList(2,2,2,2,4,3,3,3,88);

	Set<Integer> s=new HashSet<>();
	
	for(int i1=0;i1<=l.size()-1;i1++) {
	s.add(l.get(i1));}
	
	System.out.println(s);
	 
	//finding duplicate among array
	
	int j[]= {5,6,7,8,9,2,6,3,3,88};

	
	for(int q=0;q<j.length;q++) {
		for(int w=q+1;w<j.length;w++) {
			if(j[q]==j[w]) {
			
				System.out.println("repeatating number :"+j[q]);}
			
		}
		
	}
	
	
	
	
}
}

