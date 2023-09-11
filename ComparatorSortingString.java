package collection;

import java.util.TreeSet;

public class ComparatorSortingString {
public static void main(String[] args) {
	TreeSet t=new TreeSet(new ComparatorSortingStringTest());
	t.add("A");
	t.add("Z");
	t.add("K");
	t.add("B");
	t.add("a");
	System.out.println(t);
}
}
