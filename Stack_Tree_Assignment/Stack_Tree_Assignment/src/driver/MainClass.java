package driver;
import service.BalancingBrackets;

public class MainClass {

	public static void main(String[] args) {
		String expression =  "([[{}]])";
		
		//Strings for testing
		/*
		String expression1 = "([[{}]]))";
		String expression2 = "]}))";
		String expression3 = "(";
		String expression4 = "()[]{}";
		*/
		
		boolean isBalanced = BalancingBrackets.isBalanced(expression);
		
		if(isBalanced) {
			System.out.println("The entered String has Balanced Brackets");			
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
			
		}
	}

}
