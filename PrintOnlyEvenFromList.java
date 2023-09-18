package stream;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintOnlyEvenFromList {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	for(int i=1;i<=9;i++) {
	l.add(i);
}
	System.out.println(l);
	
	
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		Integer a=(Integer)itr.next();
		if(a%2==0)System.out.println(a);
	}
}}
