package stringprograms;

public class ReverseStatement {

	public static void main(String[] args) {
		String s = "I am Swapnil";
		StringBuilder sb = new StringBuilder();
		String[] splittedArray = s.split(" ");
		for(int i=0; i<splittedArray.length; i++) {
			sb.append(reverse(splittedArray[i]));
			sb.append(" ");
		}
        System.out.print("Answer is " + sb.toString());
	}

	private static String reverse(String s) {

		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();

	}


}
