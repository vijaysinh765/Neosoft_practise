package stream;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectOnlyEvenFromList {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	for(int i=1;i<=9;i++) {
	l.add(i);
}
	System.out.println(l);
	
	ArrayList l1=new ArrayList();
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		Integer a=(Integer)itr.next();
		if(a%2==0)l1.add(a);
	}
	System.out.println(l1);
}
}
