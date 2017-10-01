package BracketBalance;

import java.util.*;

public class BracketBalance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}

	}

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expression.length(); i++) {
			switch (expression.charAt(i)) {
			case '(':
				stack.push('(');
				break;
			case '[':
				stack.push('[');
				break;
			case '{':
				stack.push('{');
				break;
			case ')':
				if (!stack.isEmpty()) {
					if (stack.peek() == '(') {

						stack.pop();
					}
				} else {
					return false;
				}
				break;
			case ']':
				if (!stack.isEmpty()) {
					if (stack.peek() == '[') {

						stack.pop();
					}
				} else {
					return false;
				}
				break;
			case '}':
				if (!stack.isEmpty()) {
					if (stack.peek() == '{') {

						stack.pop();
					}
				} else {
					return false;
				}

				break;
			}

		}

		if (stack.isEmpty())

		{
			return true;
		}
		return false;

	}
}
