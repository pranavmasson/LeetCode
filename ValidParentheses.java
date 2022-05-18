package files;

import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		} else if (checkNumber(s) == false) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(')');
			} else if (s.charAt(i) == '{') {
				stack.push('}');
			} else if (s.charAt(i) == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkNumber(String s) {
		int bracket1a = 0; // num of '('
		int bracket1b = 0; // num of ')'
		int bracket2a = 0; // num of '{'
		int bracket2b = 0; // num of '}'
		int bracket3a = 0; // num of '['
		int bracket3b = 0; // num of ']'
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				bracket1a++;
			} else if (s.charAt(i) == ')') {
				bracket1b++;
			} else if (s.charAt(i) == '{') {
				bracket2a++;
			} else if (s.charAt(i) == '}') {
				bracket2b++;
			} else if (s.charAt(i) == '[') {
				bracket3a++;
			} else if (s.charAt(i) == ']') {
				bracket3b++;
			} else {
				return false;
			}
		}
		if (bracket1a != bracket1b) {
			return false;
		} else if (bracket2a != bracket2b) {
			return false;
		} else if (bracket3a != bracket3b) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isValid("(("));
	}

}
