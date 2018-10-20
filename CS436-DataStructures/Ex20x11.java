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
		
			
			s = readFile.next();
						
		}
		
		StringTokenizer tokens = new StringTokenizer(s, "[](){}", true);
		
		while (tokens.hasMoreTokens()) {		//loop will run as long as tokens has brackets left
		     String token = tokens.nextToken().trim();	//takes the next available token, trims it, and sets it to token
		     if (token.length() == 0) {			//if there isn't a token then go to next iteration
		              continue;
		     }
		     else if (token.charAt(0) == '[') {		//checks if it's a opening bracket
		    	 
		    	 oneStack.push(token.charAt(0));
		    	 
		     }
		     else if (token.charAt(0) == '(') {
		    	 
		    	 oneStack.push(token.charAt(0));
		    	 
		     }
		     else if (token.charAt(0) == '{') {
		    	 
		    	 oneStack.push(token.charAt(0));		    	 
		     }
		     else if (token.charAt(0) == '}' && oneStack.peek() == '{') {
		    	 
		    	 oneStack.pop();	    	 
		     }
		     else if (token.charAt(0) == ')' && oneStack.peek() == '(') {
		    	 
		    	 oneStack.pop();	    	 
		     }
		     else if (token.charAt(0) == ']' && oneStack.peek() == '[') {
		    	 
		    	 oneStack.pop();	    	 
		     }
		
	}
		
		if (!oneStack.empty())
		{
			System.out.println("Invalid sequence of parenthesis");
		}
		
		readFile.close();
		userInput.close();
	
}
}
