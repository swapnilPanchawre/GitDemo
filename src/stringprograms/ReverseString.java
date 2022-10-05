package stringprograms;

public class ReverseString {
	
	public static String reverseString(String str) {
		
		//int len= str.length();
		String reverse = "";
		 for(int i = str.length()-1;i>=0;i--) {
			 reverse = reverse + str.charAt(i);
		 }
		
		return reverse;
		
	}
	public static void main(String[] args) {
		 String rev = reverseString("AUTOMATION TESTER");
		 System.out.println(rev);
	}

}
