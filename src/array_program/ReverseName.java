package array_program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseName {

	
	public static void main (String []args ) 
	{
		String name [] =new String[4];
		
		name[0]= "swapnil";
		name[1]="gauri";
		name[2]= "madhavi";
		name[3]="rukmini";
		
		Arrays.sort(name);
		
		for (int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}
}




// o/p
// gauri--> madhavi-->rukmini-->swapnil
