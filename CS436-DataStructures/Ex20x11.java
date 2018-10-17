import java.util.*;
import java.io.*;

public class Ex20x11 {

	public static void main(String args[]) throws FileNotFoundException {
		
		File test = new File("testt.txt");
		Scanner help = new Scanner(test);
		LinkedList inOrder = new LinkedList<>();
		
		
		while(help.hasNext()){
		
			
			
				String[] convertArray = help.nextLine().split(" ");
				for ( int i = 0; i < convertArray.length; i++ )
				{
					if (convertArray[i].length() > 0 && 
							 Character.isLetter(convertArray[i].charAt(0))) {
						
						inOrder.add(convertArray[i]);
						
						}
					
				}
			
			
		}
		
		Collections.sort(inOrder);
		
		help.close();
		
		System.out.println(inOrder);
		
	}
	
}
