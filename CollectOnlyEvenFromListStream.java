package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectOnlyEvenFromListStream {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();

	for(int i=0;i<=10;i++) {
	al.add(i);}
	System.out.println(al);
	List<Integer>l1=(List<Integer>) al.stream().filter(i-> (i%2==0)).collect(Collectors.toList());
	System.out.println(l1);


}
}
