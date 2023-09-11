package interview.collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInSet {
	
	//add khalun iterate varun
	
	public static void main(String[] args) {
		Set<String> mh=new HashSet<>();
		mh.add("pu");
		mh.add("mumbai");
		
		Set<String> jh=new HashSet<>();
		jh.add("ranchi");
		jh.add("jabalpur");
		
		Set<Set<String>> india=new HashSet<>();
		india.add(mh);
		india.add(jh);
		
//		Iterator itr=india.iterator();                             //iterator
//		while(itr.hasNext()){
//			Set<String>state=(Set<String>)itr.next();
//			
//			Iterator itr1=state.iterator();
//			while(itr1.hasNext()){
//				String city=(String)itr1.next();
//				System.out.println(city);
//			}
//		}
		
//      for(Set<String>state:india)                                //for loop
	//	{
//    	for(String city:state) {
//    		System.out.println(city);
//    	}
//      }	

		india.forEach(state ->state.forEach(System.out::println)); //forEach lambda expression
		india.forEach(state->state.forEach(city ->System.out.println(city)));////forEach lambda expression
	}

}
