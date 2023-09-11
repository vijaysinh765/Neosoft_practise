package collection;

import java.util.TreeSet;

public class ComparatorSortingStringStringBuffer {
public static void main(String[] args) {
	TreeSet t=new TreeSet(new ComparatorSortingStringStringBufferTest());
	t.add("A");
	t.add(new StringBuffer("ABC"));
	t.add(new StringBuffer("AA"));
	t.add(new StringBuffer("AACD"));
	t.add("XX");
	t.add("ABCD");
	t.add("A");
	System.out.println(t);
}
}
