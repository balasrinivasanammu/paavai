package PaavaiDSpack;
/*
public class Paavai10thdayStackapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(a+b)-(c-d)"));  // true
        System.out.println(isBalanced("(a+b)*(c-d"));   // false
    }
}


import java.util.Stack;

public class PostfixEval {
    public static int evaluate(String expr) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("23*54*+9-")); // Example postfix expression
    }
}

*/
import java.util.Stack;

public class Paavai10thdayStackapplication {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
        	
        	while (!stack.isEmpty() && arr[i] > stack.peek()) {
        		 
                System.out.println(stack.pop() + " -> " + arr[i]);
            }
            stack.push(arr[i]);
        }  

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " -> -1");
        }
    }
}


