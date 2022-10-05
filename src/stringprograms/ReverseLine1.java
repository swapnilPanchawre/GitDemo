package stringprograms;
public class ReverseLine1 {
		
		public static void main(String[] args) {
			
			String st = "Automation Tester";
			String output = "";
			String[] words = st.split(" ");
			// System.out.println(words);
			// String output ="";
			for(int i = 0;i<words.length;i++) {
				String word = words[i];
			System.out.println(word);
				//String reverse = new String();
				String reverse = "";
			for(int j = word.length()-1;j>=0;j--) {
				reverse =reverse + word.charAt(j);
			}
			output =output+reverse;
			if (i != words.length-1) {
				output = output+" ";
			}
			}
				System.out.println(output);
			}
		}
	