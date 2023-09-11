package collection;

import java.util.PriorityQueue;

public class PriorityQue1 {
public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
	for(int i=1;i<=9;i++) {
	p.offer(i);}         //add element in queue
	System.out.println(p);
	p.poll();
	System.out.println(p);//remove andreturn elements in a row
}

}
