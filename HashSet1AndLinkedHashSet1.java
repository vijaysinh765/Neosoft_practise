package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet1AndLinkedHashSet1 {
public static void main(String[] args) {
	HashSet s=new HashSet();
	s.add("B");
	s.add("C");
	s.add("D");
	s.add("Z");
	s.add(null);
	s.add(1);
	//s.add("Z")
	System.out.println(s.add("Z"));//false
	System.out.println(s);         //[null, 1, B, C, D, Z]-insertion order not maintained
	
	LinkedHashSet l=new LinkedHashSet();
	l.add("B");
	l.add("C");
	l.add("D");
	l.add("Z");
	l.add(null);
	l.add(1);
	System.out.println(l);//[B, C, D, Z, null, 1]-insertion order maintained
}
}
