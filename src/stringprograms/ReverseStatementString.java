package stringprograms;

public class ReverseStatementString {

	public static void main(String[] args) {
		String s = "I am Swapnil";
		String sb = new String();
		String[] splittedArray = s.split(" ");
		for(int i=0; i<splittedArray.length; i++) {
			sb = sb + reverse(splittedArray[i]);
			sb = sb + " ";
		}
        System.out.print("Answer is " + sb);
	}

	private static String reverse(String s) {

		String sb = new String();
		for(int i = s.length()-1;i>=0;i--) {
			sb = sb + s.charAt(i);
		}
		return sb;

	}


}
