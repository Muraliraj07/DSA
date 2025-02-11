package easy;

import java.util.Stack;

public class E06_ValidParenthesis {

	public static void main (String args[]) {
		String test1 = "(){}[]";
		System.out.println(checkValidParanthesis(test1));
	}
	
	static boolean checkValidParanthesis(String a) {
		if(a.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stact = new Stack<>();
		for(char c :a.toCharArray()) {
			if(c == '{' || c == '(' || c == '[') {
				stact.push(c);
			}
			else if(c == '}' && !stact.isEmpty() && stact.peek()=='{') {
				stact.pop();
			}
			else if(c == ')' && !stact.isEmpty() && stact.peek()=='(') {
				stact.pop();
			}
			else if(c == ']' && !stact.isEmpty() && stact.peek()=='[') {
				stact.pop();
			}
			else {
				return false;
			}
		}
		return stact.isEmpty();
	}
	
}
