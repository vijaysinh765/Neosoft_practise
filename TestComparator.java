package inteview.collection.comprator;

import java.util.Set;
import java.util.TreeSet;

public class TestComparator {
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setEid(10);
	e1.setEname("aaa");
	e1.setEsalary(111);
	
	Employee e2=new Employee();
	e2.setEid(2);
	e2.setEname("zbb");
	e2.setEsalary(222);
	
	Set<Employee> ts=new TreeSet<>(new NameSorting());
	ts.add(e1);
	ts.add(e2);
	
	ts.forEach(n ->{
		System.out.println(n.getEid());
		System.out.println(n.getEname());
		System.out.println(n.getEsalary());
	});
	
	Set<Employee> ts1=new TreeSet<>(new IdSorting());
	ts1.add(e1);
	ts1.add(e2);
	
	ts1.forEach(n1 ->{
		System.out.println(n1.getEid());
		System.out.println(n1.getEname());
		System.out.println(n1.getEsalary());
	});
}
}
