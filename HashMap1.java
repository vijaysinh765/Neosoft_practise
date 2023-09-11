package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
public static void main(String[] args) {
	HashMap h=new HashMap();
	h.put("chiranjivi",700);
	h.put("balaih", 800);
	h.put("venkatesh", 1000);
	h.put("nagarjuna", 500);
	System.out.println(h);
	h.put("chiranjivi", 1000);
	System.out.println(h);
	Set s=h.keySet();
	System.out.println(s);
	Collection c=h.values();
	System.out.println(c);
	Set s1=h.entrySet();
	Iterator itr=s1.iterator();
	while(itr.hasNext()) {
		Map.Entry m  =(Map.Entry)itr.next();
		System.out.println(m.getKey()+"..."+m.getValue());
		if(m.getKey().equals("nagarjuna"))
			m.setValue(700);
		System.out.println(m);
	}
}
}
