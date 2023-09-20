package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllFilterMapCountSortedMaxMinForEach {
	public static void main(String[] args) {
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(0);l.add(15);l.add(10);l.add(5);l.add(30);l.add(25);l.add(20);
		System.out.println(l);
		List l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());//filter
		System.out.println(l1);
		List l2=l.stream().map(i->i+10).collect(Collectors.toList()); //map
		System.out.println(l2);
		long l3=l.stream().filter(i->i%5==0).count();                //  count
		System.out.println(l3);
		List l4=l.stream().sorted().collect(Collectors.toList());     //sorting
		System.out.println(l4);
		List l5=l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList()); //sorting
		System.out.println(l5);
		Integer l6=l.stream().max((s1,s2)->s1.compareTo(s2)).get();  //max
		System.out.println(l6);
		Integer l7=l.stream().min((s1,s2)->s1.compareTo(s2)).get();  //min
		System.out.println(l7);
		l.stream().forEach(System.out::print);                       //foreach
		
		
	}

}
