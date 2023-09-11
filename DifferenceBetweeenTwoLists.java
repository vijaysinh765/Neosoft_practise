package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweeenTwoLists {

	public String name;
	 public String salary;
	
	
	public DifferenceBetweeenTwoLists(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		
		DifferenceBetweeenTwoLists employee= new DifferenceBetweeenTwoLists("vijay","500000");
		
		Set<DifferenceBetweeenTwoLists> s= new HashSet<>();
		s.add(employee);
		s.add(employee);
		System.out.println(employee);
	}
	
}
