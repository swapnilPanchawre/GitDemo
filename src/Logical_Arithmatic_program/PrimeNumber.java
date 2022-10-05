package Logical_Arithmatic_program;

public class PrimeNumber {
	
	int low = 20;
	int high = 80;
	
	public void prime_method() {          // must learn and find alternative method to understand
		
	while (low<=high) {
		
		boolean isPrime = true ;
		
		for (int i =2;i<=low/2;i++) {
			
			if(low%i==0) {
				isPrime = false;
				break;
			}
		}
	if (isPrime && low > 1) {
		System.out.print(low + " ");
	}

	low++;
	}
	
	}
public static void main (String []args) {
	PrimeNumber prime = new PrimeNumber ();
	prime.prime_method();
}
}
