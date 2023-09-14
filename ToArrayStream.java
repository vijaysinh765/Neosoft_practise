package stream;

import java.util.ArrayList;

public class ToArrayStream {
public static void main(String[] args) {
	ArrayList<Integer>l=new ArrayList();
    for(int i=0;i<=10;i++) {
	l.add(i);}
	
	Integer[] ir= l.stream().toArray(Integer[]::new);//copy elements present in stream into specified array
	for(Integer i:ir) {
		System.out.println(i);
	}
}
}
