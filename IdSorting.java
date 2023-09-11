package inteview.collection.comprator;

import java.util.Comparator;

public class IdSorting implements Comparator {
	public int compare(Object o1,Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.getEid()-e2.getEid();
	}

}
