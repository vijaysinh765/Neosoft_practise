package collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {
public static void main(String[] args) {
	SortedMap s=new TreeMap();
	s.put(101,"A");
	s.put(102,"B");
	s.put(103,"C");
	s.put(104,"D");
	s.put(105,"E");
	System.out.println(s);
	System.out.println(s.firstKey());//firstKey()-101
	System.out.println(s.lastKey()); //lastKey()-105
	System.out.println(s.headMap(104));//headMap()-{101=A, 102=B, 103=C}
	System.out.println(s.tailMap(104));//tailMap()-{104=D, 105=E}
	System.out.println(s.subMap(103, 105));//subMap()-{103=C, 104=D}
}
}
