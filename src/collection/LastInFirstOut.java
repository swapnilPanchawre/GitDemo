package collection;

import java.util.Stack;

public class LastInFirstOut {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push("vikas");
		s.push("Dhananjay");
		s.push("first");
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
	}

}
