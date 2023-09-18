package stream;

import java.util.ArrayList;

public class MaxMinStream {
public static void main(String[] args) {
	ArrayList<String>l=new ArrayList<>();
	l.add("rvk");
	l.add("rk");
	l.add("rkv");
	l.add("rvki");
	l.add("rvkir");
	l.stream().forEach(System.out::println);
	System.out.println(l);
	String max=l.stream().max((s1,s2)->s1.compareTo(s2)).get();
	String min=l.stream().min((s1,s2)->s1.compareTo(s2)).get();
	System.out.println("Max string is:"+max);
	System.out.println("min string is:"+min);
	
	ArrayList<Integer> a=new ArrayList<>();
	for(int i=1;i<=10;i++) {
	a.add(i);}
	Integer max1=a.stream().max((s1,s2)->s1.compareTo(s2)).get();
	Integer min1=a.stream().min((s1,s2)->s1.compareTo(s2)).get();
	System.out.println("max number is:"+max1);
	System.out.println("min number is "+min1);
}
}
