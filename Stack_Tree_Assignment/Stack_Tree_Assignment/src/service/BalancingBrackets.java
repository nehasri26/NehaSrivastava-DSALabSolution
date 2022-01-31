package service;
import java.util.Stack;

public class BalancingBrackets {
	

	
	public static boolean isBalanced(String exp) {
		Stack<Character> stk= new Stack<>();  
		char[] expArray =  exp.toCharArray(); 
		
		for(int i=0;i<expArray.length;i++) {
			if(expArray[i]== '(' || expArray[i]== '{' || expArray[i]== '[')
			stk.push(expArray[i]);
			if(expArray[i]== ')' || expArray[i]== '}' || expArray[i]== ']') {
				if(stk.isEmpty())
					return false;
				char bracket = stk.pop();
				switch(bracket) {
				case '(':
					if(expArray[i] != ')')
						return false;
					break;
				case '{':
					if(expArray[i] != '}')
						return false;
					break;
				case '[':
					if(expArray[i] != ']')
						return false;
					break;
				}
			}
		}
		if(stk.isEmpty())
			return true;
		else 
			return false;
	}
	

}
