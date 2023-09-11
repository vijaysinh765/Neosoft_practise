package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
public static void main(String[] args) {
	SortedSet s=new TreeSet() ;
	for(int i=100;i<=105;i++) {
	s.add(i);}
	 
	System.out.println(s.first());
	System.out.println(s.last());
	System.out.println(s.headSet(103));
	System.out.println(s.tailSet(103));
	System.out.println(s.subSet(101, 104));
	System.out.println(s.comparator());

}
}