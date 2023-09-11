package collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);
		System.out.println(s.search("D"));//search-1
		System.out.println(s.search("A"));//search-4
		System.out.println(s.pop());
		System.out.println(s.pop());     // pop-remove and return top of the stack
		
		s.remove(1);
		System.out.println(s);
	}

}
