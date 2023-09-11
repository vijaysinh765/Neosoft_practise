package collection;

import java.util.TreeSet;

public class ComparableSortingTreeSet1 {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add("A");      //unicode value -60
	t.add("a");      //unicode value -95
	t.add("B");
	t.add("Z");
	t.add("L");
	System.out.println(t);//[A, B, L, Z, a]
	"a".compareTo("A");
	System.out.println("a".compareTo("A"));
	System.out.println("B".compareTo("a"));
	System.out.println("Z".compareTo("B"));
	System.out.println("L".compareTo("Z"));
	System.out.println("Z".compareTo("Z"));
	//System.out.println("Z".compareTo(null));//NullPointerException

	//t.add(null);//NullPointerException
	//t.add(new Integer(10));//ClassCasteException
	//t.add(new StringBuffer("S"));//ClassCasteException
	System.out.println(t);
}
}
