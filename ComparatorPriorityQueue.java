package collection;

import java.util.PriorityQueue;

public class ComparatorPriorityQueue {
public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue(new ComparatorPriorityQueueTest());
	p.offer("A");
	p.offer("Z");
	p.offer("C");
	p.offer("B");
	System.out.println(p);
}
}
