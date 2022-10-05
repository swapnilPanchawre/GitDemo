package collection;

import java.util.ArrayDeque;

public class FirstInFirstout {

	public static void main(String[] args) {
		
		ArrayDeque d=new ArrayDeque(); //FIFO OPERATION(FIRST IN FIRST OUT)
		 
		 d.push("Shweta"); 
		 d.push("Hemant"); 
		 d.push("Pushpa"); //add-> push method
		 
		 System.out.println(d);
		 d.pop(); //FIFO
		 System.out.println(d);
	}
}
