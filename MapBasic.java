package interview.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapBasic {
	public static void main(String[] args) {
		
		Map<Integer,String>hm=new HashMap<>();
		hm.put(1, "aab");
		hm.put(2, "bbb");
		hm.put(3, "ccc");
		
		Set<Integer>keys=hm.keySet();
		
//		Iterator itr=keys.iterator();         //iterator
//		while(itr.hasNext()) {
//		Integer	key=(Integer) itr.next();
//		String m=hm.get(key);
//		System.out.println(m);
//			
//		}
		
//		for(Integer key:keys)                 //for
//		{
//			String m=hm.get(key);
//			System.out.println(m);
//		}
		
		keys.forEach(key->{
			String m=hm.get(key);
			System.out.println(m);
			
		});                                   //forEach
		
	}
}
