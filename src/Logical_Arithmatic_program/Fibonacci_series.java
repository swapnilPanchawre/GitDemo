package Logical_Arithmatic_program;

public class Fibonacci_series {
	
	public void Fibonacci_Series() {
		
		int n1=0,n2=1,n3,count=10;
		System.out.print(n1+" "+n2);
		
		for (int i=2;i<count;i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
	public static void main (String []args) {
		
		Fibonacci_series fibo = new Fibonacci_series ();
		fibo.Fibonacci_Series();
	}
}
