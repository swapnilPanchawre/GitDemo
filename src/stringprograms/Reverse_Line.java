package stringprograms;

public class Reverse_Line {
	
	public static void main(String[] args) {
		
		String st = "Automation Tester";
		String output =new String();
		String[] words = st.split(" ");
		//String output ="";
		for(int i = 0;i<words.length;i++) {
			String word = words[i];
			String reverse = new String();
		
		for(int j = word.length()-1;j>=0;j--) {
			reverse =reverse + word.charAt(j);
		}
	
		output =output+reverse;
		
			System.out.println(output);
		}
	}
}

