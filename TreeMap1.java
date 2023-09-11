package collection;

import java.util.TreeMap;

public class TreeMap1 {
public static void main(String[] args) {
	TreeMap t=new TreeMap();
	
	t.put(100,"XXX");
	t.put(102,"ZZZ");
	t.put(101,"YYY");
	t.put(105,"AAA");
	t.put(104,"BBB");
	System.out.println(t);//{100=XXX, 101=YYY, 102=ZZZ, 104=BBB, 105=AAA}
   // t.put("AAA","AAA");//CCE
    //t.put(null,100);   //NPE
}
}
