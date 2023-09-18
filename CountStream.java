package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountStream {
public static void main(String[] args) {
	ArrayList<String>l=new ArrayList<>();
	l.add("rvk");
	l.add("rk");
	l.add("rkv");
	l.add("rvki");
	l.add("rvkir");
	System.out.println(l);
	long l1= l.stream().filter(s->s.length()==3).count();
	System.out.println(l1);
}
}
