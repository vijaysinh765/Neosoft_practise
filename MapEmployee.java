package interview.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import inteview.collection.comprator.Employee;

public class MapEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(01);
		e.setEname("abc");
		Employee e1=new Employee();
		e1.setEid(02);
		e1.setEname("bbc");
		Employee e2=new Employee();
		e2.setEid(03);
		e2.setEname("ccc");
		
		Map<Integer,Employee> hm=new HashMap<>();  //Map,HashMap
		hm.put(1, e);                              //put method
		hm.put(2, e1);
		hm.put(3, e2);
		
		Set keys=hm.keySet();                     //keySet method
		
//		Iterator itr=keys.iterator();               //iterator hm.get(key) method
//		while(itr.hasNext()) {
//			Integer key=(Integer) itr.next();
//			Object o=hm.get(key);
//			Employee eo=(Employee)o;
//			System.out.println(eo.getEid());
//			System.out.println(eo.getEname());
//			
//		}
		                                           //for
//		for(Object key:keys) {
//			
//			Object o=hm.get(key);
//			Employee eo=(Employee)o;
//			System.out.println(eo.getEid());
//			System.out.println(eo.getEname());
//		}
		                                           //forEach  hm.get(key) method
		keys.forEach(key->{
			Object o=hm.get(key);
			Employee eo=(Employee)o;
			System.out.println(eo.getEid());
			System.out.println(eo.getEname());
		});
	}
}
