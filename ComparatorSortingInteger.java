package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorSortingInteger {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(10);
	t.add(50);
	t.add(20);
	t.add(30);
	t.add(40);
	System.out.println(t);//DefaultNaturalSortingUsingComparable-[5, 10, 15, 20, 25]
	TreeSet c=new TreeSet(new ComparatorSortingIntegerTest());
	c.add(5);
	c.add(10);
	c.add(15);
	c.add(20);
	c.add(25);
	System.out.println(c);//CustomisedSortingUsingComparator-[5, 10, 15, 20, 25]
}
}
