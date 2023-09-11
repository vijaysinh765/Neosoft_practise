package collection;

import java.util.Comparator;

public class ComparatorSortingStringTest implements Comparator {
	
	public int compare(Object obj1,Object obj2){
		String S1=(String)obj1;
		String S2=(String)obj2;
//		if(I1<I2) return +1;
//		else if(I1>I2) return -1;
//		else return 0;
		//return S1.compareTo(S2);//[A, B, K, Z, a]
		//return S2.compareTo(S1);//ReverseOfDnso-[a, Z, K, B, A]
		return -S1.compareTo(S2);//ReverseOfDnso-[a, Z, K, B, A]
		
	}

}
