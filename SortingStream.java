package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStream {
public static void main(String[] args) {
	ArrayList<String>l=new ArrayList<>();
	l.add("rvk");
	l.add("rk");
	l.add("rkv");
	l.add("rvki");
	l.add("rvkir");
List l1=	l.stream().sorted().collect(Collectors.toList());  //DNSO
List l2=l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());//reverseOfDnSo
System.out.println(l1);
System.out.println(l2);
}
}
