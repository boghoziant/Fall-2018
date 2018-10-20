import java.util.*;
import java.io.*;

public class Ex20x11 {

	public static void main(String args[]) throws FileNotFoundException {
			
		
		String userStorage;
		Scanner userInput = new Scanner(System.in);
		userStorage = userInput.next();
		
		
		File userFile = new File(userStorage);		
		Scanner readFile = new Scanner(userFile);
		Stack<Character> oneStack = new Stack<>();
		
		String s = null;
		
		while(readFile.hasNext()){
		
			
			s.(readFile.next());
						
		}
		
		StringTokenizer tokens = new StringTokenizer(s, "[](){}", true);
		
		while (tokens.hasMoreTokens()) {
		     String token = tokens.nextToken().trim();
		     if (token.length() == 0) {
		              continue;
		     }
		     else if (token.charAt(0) == '[') {
		    	 
		     }
		    
		
		
		userInput.close();
	
		
	}
	
}
}
