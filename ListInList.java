package interview.collection.ListInList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInList {

	public static void main(String[] args) {
		
		List<String>  mh=new ArrayList<String>();
		mh.add("Pune");
		mh.add("mumbai");
		
		List<String> jh=new ArrayList<String>();
		jh.add("ranchi");
		jh.add("jabalpur");
		
		List< List<String>>india=new ArrayList<List<String>>();
		india.add(mh);
		india.add(jh);
		
		
//		india.forEach(state->state.forEach(System.out::println)); //forEach using lambda expression
//		
//		india.forEach(state->state.forEach(city->System.out.println(city)));//forEach using lambda expression
//		
//		for(List<String> state:india)                           //for loop in collection
//		{
//			
//			for(String city:state) {
//				System.out.println(city);
//			}
//		}
		
		Iterator itr=india.iterator();                         //iterator in collection
		
		while(itr.hasNext()) {
			
			List<String>state=(List<String>)itr.next();
			
			Iterator city=state.iterator();
			while(city.hasNext()){
				String a=(String)city.next();
				System.out.println(a);
			}
			
			
			
		}
		
	}
}
