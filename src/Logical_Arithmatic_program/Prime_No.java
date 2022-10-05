package Logical_Arithmatic_program;

public class Prime_No {
	
	public static void main(String[] args) {
		
		int num=73;
		int no=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				no=no+1;
				
			}
			
		}
		if(no>1) {
			System.out.println(num+ " number is not prime no");
		}else {
			System.out.println(num +" number is prime no");
		}
	
	}

}
