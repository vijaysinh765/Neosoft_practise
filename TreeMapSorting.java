package collection;

import java.util.TreeMap;

public class TreeMapSorting {
public static void main(String[] args) {
	TreeMap t=new TreeMap(new TreeMapSortingTest());
	t.put("XXX",10);
	t.put("AAA", 20);
	t.put("ZZZ", 30);
	t.put("LLL",40);
	System.out.println(t);
	
}
}
