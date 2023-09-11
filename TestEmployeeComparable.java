package interview.collection.comparable;

import java.util.Set;
import java.util.TreeSet;

public class TestEmployeeComparable {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEname("zabc");
		e1.setEsalary(111);
		
		Employee e2=new Employee();
		e2.setEid(22);
		e2.setEname("zzijk");
		e2.setEsalary(222);
		
		Employee e3=new Employee();
		e3.setEid(3);;
		e3.setEname("zzzxyz");
		e3.setEsalary(333);
		
		Set<Employee> ts=new TreeSet<Employee>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		ts.forEach(n ->{System.out.println(n.getEid());
		System.out.println(n.getEname());
		System.out.println(n.getEsalary());
		
				});
			
		
		
		
	}

}
