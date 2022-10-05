package array_program;

import java.util.Stack;

public class StackA_Program {
	
	public static void main(String[] args) {
		
		// last in first out
		Stack s = new Stack();
		s.push("mahesh");
		s.push("vikas");
		s.push("mangesh");
		s.push("kishor");
		
		System.out.println(s);
		
		s.pop();// pop method for last in first out
		System.out.println(s);
		
	}

}
